# Bedroom Composition Exercise

## Overview

This Java project is designed as an exercise in **class composition**. 
The goal is to create a fully composed `Bedroom` class by designing and integrating five interrelated classes: 
`Lamp`, `Bed`, `Ceiling`, `Wall`, and `Bedroom`. 
Each class encapsulates specific attributes and behaviors, and the `Bedroom` class brings them together in a meaningful and structured way. 
You will learn the core object-oriented programming (OOP) principle of composition, where complex types are built using simpler, reusable components.

---

## Objective

The primary objective of this exercise is to:

- Practice **encapsulation** by keeping member variables private.
- Use **constructors** to initialize objects.
- Create and call **methods** that simulate real-world interactions.
- Demonstrate how multiple classes can work together to form a complex system.
- Strengthen understanding of **object composition** in Java.

---

## Class Descriptions

### 1. Lamp
Represents a lamp with the following attributes and behavior:
- **Fields**: `style` (String), `battery` (boolean), `globRating` (int)
- **Methods**:
    - `turnOn()`: Prints "Lamp -> Turning on"
    - `getStyle()`, `isBattery()`, `getGlobRating()`: Return respective values

### 2. Bed
Models a bed with detailed properties:
- **Fields**: `style` (String), `pillows`, `height`, `sheets`, `quilt` (all int)
- **Methods**:
    - `make()`: Prints "Bed -> Making | "
    - Accessor methods for all fields

### 3. Ceiling
Defines ceiling characteristics:
- **Fields**: `height`, `paintedColor` (int)
- **Methods**:
    - `getHeight()`, `getPaintedColor()`

### 4. Wall
Represents a wall with a direction:
- **Field**: `direction` (String)
- **Method**:
    - `getDirection()`

### 5. Bedroom
A composition class that integrates all others:
- **Fields**: `name` (String), `wall1`–`wall4` (Wall), `ceiling` (Ceiling), `bed` (Bed), `lamp` (Lamp)
- **Methods**:
    - `makeBed()`: Prints "Bedroom -> Making bed | " and calls `bed.make()`
    - `getLamp()`: Returns the `lamp` object

---

## Sample Output

To validate your implementation, use the following sample `main()` method:

```java
Wall wall1 = new Wall("West");
Wall wall2 = new Wall("East");
Wall wall3 = new Wall("South");
Wall wall4 = new Wall("North");

Ceiling ceiling = new Ceiling(12, 55);

Bed bed = new Bed("Modern", 4, 3, 2, 1);

Lamp lamp = new Lamp("Classic", false, 75);

Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

bedRoom.makeBed();
bedRoom.getLamp().turnOn();
