# 🍔 Restaurant Meal Builder - Java OOP Challenge

This project is a Java-based **restaurant meal builder** app that lets users customize fast-food meals by choosing a burger, drink, and side — with the option to add toppings, upgrade to a deluxe burger, and view an itemized receipt.

---

## 🧠 Key Concepts Practiced
- Object-Oriented Programming (OOP)
- Inheritance
- Method Overriding
- Encapsulation
- Polymorphism (instanceof)
- Constructor Overloading
- Static vs Instance methods
- Formatted output with printf()
- Clean method organization and class responsibility

---

## 📚 Learning Goals
This challenge helped reinforce OOP design principles by simulating a real-world application where:
- Each class represents a specific responsibility.
- Inheritance is used to extend and specialize behavior.
- The app produces dynamic outputs based on user input.

---

## 🚀 Features

- ✅ Create a **base burger** with up to 3 toppings
- ✅ Create a **deluxe burger** with up to 5 toppings — extras don’t affect price
- ✅ Add a **drink** with size-based price adjustments (SMALL, MEDIUM, LARGE)
- ✅ Add a **side item** (e.g. fries, chili)
- ✅ Automatically generate a full **itemized receipt** with:
    - Burger + toppings breakdown
    - Drink + side item
    - Final total

---

## Potential expansion ideas on this project: 
- Add support for multiple sizes of side items
- Include a GUI version using Java Swing or JavaFX
- Store order history or generate printable receipts
- Add combo meal discounts or calorie tracking

---

## 🧱 Project Structure

- `Item.java`: Represents any purchasable item (topping, drink, side). Handles name formatting and price adjustments.
- `Burger.java`: Extends `Item`. Supports up to 3 customizable toppings and prints an itemized burger receipt.
- `DeluxeBurger.java`: Inherits from `Burger`. Adds 2 more toppings with fixed pricing. Overrides behavior to make all toppings free.
- `MealOrder.java`: A complete meal consisting of one burger, one drink, and one side. Calculates total and prints itemized list.
- `Main.java`: Demo file to test various meal combinations.

---

## 📦 Sample Output

### Regular Meal
```text
         BASE BURGER:       4.00
              BACON:        1.50
             CHEESE:        1.00
               MAYO:        0.00
    ------------------------------
       REGULAR BURGER:      6.50
         LARGE COKE:        2.00
       MEDIUM FRIES:        1.50
    ------------------------------
         TOTAL PRICE:      10.00
