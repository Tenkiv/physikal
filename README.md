# Physikal

### Library providing Kotlin extensions and ease of use functions for Java Units of Measurement libraries.

### Contains
- [Core](core) - Basic Metric Units. 
- [SI-Units](si-units) - SI Units.
- [Complete-Units](additional-units) - All Units Including Imperial.


### Maven Central Artifacts
- #### Core [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/core)

- #### SI Units [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/si-units/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/si-units)

- #### Complete Units [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/additional-units/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/additional-units)

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
        
        (-10.nano.metre).abs()
        >> 10.0 nm

#### Using different units (SI units & other units)
        5.gram + 2.pound
        >> 912.18474 g
        
        (13.kilo.gram + 20.pound).tu(STONE)
        >> 3.47572100600243466674378 st
        
#### Special Thanks
- [The contributors and maintainers of UnitsofMeasurement](https://github.com/unitsofmeasurement).
