/*
 * Copyright 2020 Tenkiv, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

fun Job.jdk8Container(action: Container.() -> Unit) = this.container("openjdk:11") {
    action()
}

fun Container.gradleTask(task: String) = kotlinScript { api ->
    api.gradlew(task)
}

job("Build, Test, Publish") {
    //assemble step
    jdk8Container {
        gradleTask("assemble")
    }

    //test step
    jdk8Container {
        gradleTask("allTests")
    }

    //publish step
    jdk8Container {
        shellScript {
            content = """
                if grep -q "SNAPSHOT" gradle.properties; then ./gradlew publish; fi
            """
        }
    }
}