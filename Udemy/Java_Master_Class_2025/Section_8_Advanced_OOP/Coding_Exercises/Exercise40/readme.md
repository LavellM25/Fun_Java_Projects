# Polymorphism: Vehicle Class Exercise

## Overview

This Java project is designed to demonstrate the object-oriented programming (OOP) principle of **polymorphism**.  
The goal is to create a base `Car` class and extend it into three specific vehicle types: `Mitsubishi`, `Ford`, and `Holden`.  
Each subclass will **override** behaviors defined in the parent class, showing how the same method can behave differently across related objects.

---

## Objective

The primary objective of this exercise is to:

- Practice **inheritance** by creating subclasses from a base class.
- Apply **method overriding** to change behavior in child classes.
- Strengthen understanding of **polymorphism**—the ability of different classes to define different behaviors for the same method.
- Use **encapsulation** to protect data fields within the base class.

---

## Class Descriptions

### 1. Car (Base Class)

Represents a generic car with shared attributes and behaviors.

- **Fields** *(private)*:
    - `engine` (boolean): Always true for all cars.
    - `cylinders` (int): Number of engine cylinders.
    - `name` (String): Name of the car.
    - `wheels` (int): Always 4 for all cars.

- **Constructor**:
    - Accepts `cylinders` and `name` as parameters.
    - Initializes `engine = true` and `wheels = 4`.

- **Methods** *(public)*:
    - `startEngine()`: Returns `"Car -> startEngine()"`.
    - `accelerate()`: Returns `"Car -> accelerate()"`.
    - `brake()`: Returns `"Car -> brake()"`.
    - `getCylinders()`: Returns the cylinder count.
    - `getName()`: Returns the car name.

---

### 2. Mitsubishi, Ford, Holden (Subclasses of Car)

Each class:
- Inherits from `Car`.
- Has **no new fields**.
- Uses a constructor that calls the **superclass constructor**.
- **Overrides** the methods:
    - `startEngine()`: Returns `"Mitsubishi -> startEngine()"`, `"Ford -> startEngine()"`, etc.
    - `accelerate()`: Returns customized message including the class name.
    - `brake()`: Returns customized message including the class name.

---

## Tips and Reminders
- Use `@Override` annotation when redefining methods in subclasses.
- Always call `super()` in subclass constructors to pass values to the parent class.
- Return unique messages in overridden methods to demonstrate polymorphism.
- Ensure all fields in the `Car` class are `private`, and access them via `getters()` if needed.

---


## Sample Output

To validate your implementation, use the following sample `main()` method:

```java
Car car = new Car(8, "Base car");
System.out.println(car.startEngine());
System.out.println(car.accelerate());
System.out.println(car.brake());

Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
System.out.println(mitsubishi.startEngine());
System.out.println(mitsubishi.accelerate());
System.out.println(mitsubishi.brake());

Ford ford = new Ford(6, "Ford Falcon");
System.out.println(ford.startEngine());
System.out.println(ford.accelerate());
System.out.println(ford.brake());

Holden holden = new Holden(6, "Holden Commodore");
System.out.println(holden.startEngine());
System.out.println(holden.accelerate());
System.out.println(holden.brake());
