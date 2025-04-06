Printer Class Exercise
Overview
This exercise involves creating a Java class named Printer to simulate the operation of a printer, focusing on toner level management, duplex printing, and tracking printed pages. The class adheres to encapsulation principles, ensuring that the data is protected and the interaction between the class and external code is controlled.

Concepts Learned
Encapsulation: Ensuring proper data protection by using private access modifiers for class fields and providing controlled access via methods.

Constructor Initialization: Using constructors to initialize class fields with logic to validate input.

Conditional Logic: Applying checks to ensure valid inputs for methods and performing calculations based on conditions.

Boolean Operations: Handling duplex printing with boolean flags.

Class Interaction: Designing methods to interact with fields while adhering to encapsulation principles.

Objectives
Encapsulation Principles:

Protect the fields tonerLevel, pagesPrinted, and duplex using private access.

Provide controlled interactions through methods such as addToner, printPages, and getPagesPrinted.

Initialization via Constructor:

Validate tonerLevel to ensure values are between 0 and 100. If invalid, initialize to -1.

Assign the duplex field based on the constructor parameter.

Set pagesPrinted to 0 upon initialization.

Method Implementation:

addToner:

Validate input tonerAmount (0–100) and ensure the total toner level does not exceed 100.

Return updated toner level or -1 if validation fails.

printPages:

Determine double-sided printing based on the duplex flag.

Calculate total pages to print and update pagesPrinted.

Return the number of pages printed.

getPagesPrinted:

Simply return the value of pagesPrinted.

Usage Example:

Demonstrate class usage by initializing a Printer object, adding toner, printing pages, and retrieving the total pages printed.

Learning Objective:
Apply encapsulation principles to manage toner levels, printing operations, and duplex settings while ensuring controlled and protected interactions within a realistic printer simulation.


Example Usage and Output
Code Example:
```java

Printer printer = new Printer(50, true);
System.out.println(printer.addToner(50)); // Outputs: 100
System.out.println("initial page count = " + printer.getPagesPrinted()); // Outputs: 0
int pagesPrinted = printer.printPages(4);
System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
pagesPrinted = printer.printPages(2);
System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());


Expected Output:
100
initial page count = 0
Printing in duplex mode
Pages printed was 2 new total print count for printer = 2
Printing in duplex mode
Pages printed was 1 new total print count for printer = 3
Tips and Reminders
Only paste the Printer class into the exercise evaluator; the Main class is not required.

You can include a message in the printPages method to notify users that the printer is printing in duplex mode when duplex is true.

When calculating pagesToPrint for duplex mode, use the division (/) and modulo (%) operators effectively.

Learning Objective
Apply encapsulation principles to manage toner levels, printing operations, and duplex settings while ensuring controlled and protected interactions within a realistic printer simulation.

