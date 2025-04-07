# Printer Class Exercise

## Overview

This Java project is designed as an exercise in **encapsulation**.  
The goal is to create a fully functional `Printer` class that simulates realistic printer operations, including **toner management**, **duplex printing**, and **page tracking**.  
You will learn the core object-oriented programming (OOP) principle of **encapsulation**, where internal fields are protected and accessed only through public methods, allowing for controlled interaction and data validation.

---

## Objective

The primary objective of this exercise is to:

- Practice **encapsulation** by keeping member variables private.
- Use **constructors** to initialize objects with built-in validation.
- Implement **methods** to manage toner levels, printing operations, and statistics.
- Apply **conditional logic** to simulate real-world behavior.
- Strengthen understanding of how class design reflects real-life systems.

---

## Class Description

### Printer

Represents a printer with attributes and operations:

- **Fields**:
    - `tonerLevel` (int): Toner level ranging from 0 to 100, validated during initialization.
    - `pagesPrinted` (int): Tracks total number of printed pages. Initialized to 0.
    - `duplex` (boolean): Indicates whether the printer supports duplex (double-sided) printing.

- **Constructor**:
    - Validates and sets the toner level.
    - Initializes `pagesPrinted` to 0.
    - Sets the duplex mode according to the input.

- **Methods**:
    - `addToner(int tonerAmount)`: Adds toner if within range. Returns updated toner level or -1 for invalid input.
    - `printPages(int pages)`: Prints pages, calculating the number based on duplex mode. Returns number of pages printed.
    - `getPagesPrinted()`: Returns the total number of pages printed so far.
  
- **Tips and Reminders**
- Always use private access modifiers for class fields.\
- Validate toner level updates to keep values within 0–100.
- Duplex mode means fewer sheets used: use division (/) and modulo (%) for calculations.

- **Learning Outcome**
- You will gain practical experience in applying encapsulation principles to simulate a realistic printer system, 
- manage internal state responsibly, and design robust methods that reflect real-world use cases.
---

## Sample Output

To validate your implementation, use the following sample `main()` method:

```java
Printer printer = new Printer(50, true);
System.out.println(printer.addToner(50)); 
System.out.println("initial page count = " + printer.getPagesPrinted()); 

int pagesPrinted = printer.printPages(4);
System.out.println("Pages printed was " + pagesPrinted + 
                   " new total print count for printer = " + printer.getPagesPrinted());

pagesPrinted = printer.printPages(2);
System.out.println("Pages printed was " + pagesPrinted + 
                   " new total print count for printer = " + printer.getPagesPrinted());


Expcted Output: 
100
initial page count = 0
Printing in duplex mode
Pages printed was 2 new total print count for printer = 2
Printing in duplex mode
Pages printed was 1 new total print count for printer = 3
