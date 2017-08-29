# Physikal

### Library providing Kotlin extensions and ease of use functions for Java Units of Measurement libraries. 


### Contains [![License](http://img.shields.io/badge/license-BSD3-blue.svg?style=flat-square)](http://opensource.org/licenses/BSD-3-Clause)
- [Core](core) - Basic Metric units. 
- [SI-Units](si-units) - SI units.
- [Complete-Units](additional-units) - All units including imperial.


### Maven Central Artifacts
- #### Core [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/core)

- #### SI Units [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/si-units/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/si-units)

- #### Complete Units [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/complete-units/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/complete-units)

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
        
        (13.kilo.gram + 20.pound) tu STONE
        >> 3.47572100600243466674378 st
        
### Future updates
Currently all quantities are reference types, so heavy usage of this library will involve some level of extraneous object
creation. Hopefully we can resolve this issue with project valhalla or another attempt to get value
types in the JVM.
        
### Special thanks
- [The contributors and maintainers of UnitsofMeasurement](https://github.com/unitsofmeasurement).
