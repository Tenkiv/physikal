# Physikal &nbsp;[![License](http://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/MIT) [![Matrix](https://img.shields.io/badge/chat-matrix-green.svg)](https://matrix.to/#/!mIDAaHvQWPilCOvrDD:matrix.org?via=matrix.org)

Version 3 of Physikal is a complete ground up redesign for Kotlin multiplatform. It's main focus is providing type
safety for quantities in Kuantify so that use case takes priority over any other.

### MVP Goals
* A base type for for all quantities. This allows us to put an upper bound on generics, specifying that a certain type
must be a quantity.
* Type safe units (e.g. we can specify a function only accepts temperatures)
* Insignificant performance penalty when compared to just using underlying numbers.
* Ability to convert from one unit to another of the same type.
* Simple kotlinx.serialization integration.
