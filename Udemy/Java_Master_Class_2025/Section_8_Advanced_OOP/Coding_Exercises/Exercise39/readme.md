Printer Class Exercise
Overview

This Java project is designed as an exercise in encapsulation. 
The goal is to create a fully functional Printer class to simulate realistic printer operations, 
including toner management, duplex printing, and tracking printed pages. 
You will learn the core object-oriented programming (OOP) principle of encapsulation, 
where data fields are protected and external interaction is controlled through methods.

Objective
The primary objective of this exercise is to:

Practice encapsulation by keeping member variables private and accessing them through methods.

Use constructors to initialize objects with validation logic.

Implement methods to manage toner levels, duplex printing operations, and retrieve printed page statistics.

Strengthen understanding of conditional logic and how to create classes simulating real-world scenarios.


Class Description
Printer
Represents a printer with attributes and operations:

Fields:

tonerLevel (int) - Tracks toner level (0–100) with initialization validation.

pagesPrinted (int) - Keeps count of printed pages, initialized to 0.

duplex (boolean) - Indicates whether the printer can print on both sides of a page.

Constructor:

Validates toner level and initializes the duplex setting.

Sets pagesPrinted to 0 by default.

Methods:

addToner(int tonerAmount): Adds toner if the amount is valid and within the allowed range; returns updated level or -1 for invalid input.

printPages(int pages): Handles printing operations. If duplex mode is enabled, it calculates pages printed using both sides. Returns the number of pages printed.

getPagesPrinted(): Returns the total number of printed pages.

Sample Output
To validate your implementation, use the following sample main() method:

Tips and Reminders
Use private access modifiers to protect class fields and ensure controlled interaction.

Include validation checks for toner levels and duplex mode operations.

When printing pages in duplex mode, utilize the division (/) and modulo (%) operators for calculations.

You can include an optional message in the printPages method to notify users when duplex mode is active.

Learning Objective
Apply encapsulation principles to manage toner levels, printing operations, and duplex settings, ensuring proper data protection and controlled class interaction in a realistic printer scenario.

## Sample Output

```java

Printer printer = new Printer(50, true);
System.out.println(printer.addToner(50)); // Outputs: 100
System.out.println("initial page count = " + printer.getPagesPrinted()); // Outputs: 0
int pagesPrinted = printer.printPages(4);
System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
pagesPrinted = printer.printPages(2);
System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

100
initial page count = 0
Printing in duplex mode
Pages printed was 2 new total print count for printer = 2
Printing in duplex mode
Pages printed was 1 new total print count for printer = 3
