# Physikal

Kotlin based Units of Measurement library, implementing JSR363.

Adds easy to use extension functions to creating, handling, and converting Units and Quantities.

### Contains
- [Core](core) Contains Basic Metric Units. 
- [SI-Units](si-units) Contains SI Units.
- [Complete-Units](additional-units) Contains All Units Including Imperial.

### Usage
        val small = 10.metre ##Creates a Quantity<Length> with value 10m
        
        val large = 10.kilo.metre ##Creates a Quantity<Length> with value 10km
        
        val added = small + large ##All operators are supported by this library
        
        val speed = added/10.minute ##Returns a Quantity with Length per Time as its value

### Maven Central Artifacts
#### Core

        <dependency>
          <groupId>org.tenkiv.physikal</groupId>
          <artifactId>core</artifactId>
          <version>0.0.1.0</version>
        </dependency>
#### SI Units

        <dependency>
          <groupId>org.tenkiv.physikal</groupId>
          <artifactId>si-units</artifactId>
          <version>0.0.1.0</version>
        </dependency>
#### Complete Units

        <dependency>
          <groupId>org.tenkiv.physikal</groupId>
          <artifactId>additional-units</artifactId>
          <version>0.0.1.0</version>
        </dependency>

