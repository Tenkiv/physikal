# Physikal

Kotlin based Units of Measurement library, implementing JSR363.

Adds easy to use extension functions to creating, handling, and converting Units and Quantities.

### Contains
- [Core](core) Contains Basic Metric Units. 
- [SI-Units](si-units) Contains SI Units.
- [Complete-Units](additional-units) Contains All Units Including Imperial.


### Maven Central Artifacts
#### Core
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/core)

#### SI Units
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/si-units/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/si-units)

#### Complete Units
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/additional-units/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.tenkiv.physikal/additional-units)

### Usage
        val small = 10.metre ##Creates a Quantity<Length> with value 10m
        
        val large = 10.kilo.metre ##Creates a Quantity<Length> with value 10km
        
        val added = small + large ##All operators are supported by this library
        
        val speed = added/10.minute ##Returns a Quantity with Length per Time as its value


