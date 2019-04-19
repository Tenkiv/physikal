# Physikal &nbsp;[![License](http://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/MIT) [![Matrix](https://img.shields.io/badge/chat-matrix-green.svg)](https://matrix.to/#/!mIDAaHvQWPilCOvrDD:matrix.org?via=matrix.org)

Physikal is a Kotlin units of measurement, physical computing, and dimension analysis library.
Currently just extensions for [Java units of measurement](https://github.com/unitsofmeasurement/unit-api) but we are
[planning for a Kotlin multiplatform rewrite](https://gitlab.com/tenkiv/software/physikal/issues/2).

### Artifacts
 | | Core | SI Units | Complete Units
 ------- | :-----: | :-----: | :-----:
 JVM | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/physikal-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/physikal-core) | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/physikal-si-units/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/physikal-si-units) | [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/physikal-complete-units/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/physikal-complete-units)


### Usage
#### Create units
        val small = 10.metre
        
        val large = 10.kilo.metre
        
#### Includes all operators
        val added = 10.metre + 1.kilo.metre
        >> 1010.0 m
        
        val speed = added/10.minute 
        >> 101 m/min
        
        var aFewSeconds = 5.second
        aFewSeconds++
        >> 6.0 s
        
        10.peta.watt > 2.watt
        >> true
        
        5.gram <= 20.kilo.gram
        >> true
        
        (-10.nano.metre).abs()
        >> 10.0 nm
        
        ## The operator '==' does not always work reliably for quantities;
        ## the function qeq() should be used instead.
        1.kilo.gram == 1000.gram
        >> false
        
        1.kilo.gram qeq 1000.gram
        >> true
        

#### Using different units (SI units & other units)
        5.gram + 2.pound
        >> 912.18474 g
        
        (13.kilo.gram + 20.pound) convertTo STONE
        >> 3.47572100600243466674378 st
        
### Future updates
Currently all quantities are reference types, so heavy usage of this library will involve some level of extraneous 
allocation and GC. Hopefully we can resolve this issue when / if Kotlin inline classes are expanded to support multiple
properties.
        
### Special thanks
- [The contributors and maintainers of UnitsofMeasurement](https://github.com/unitsofmeasurement).
