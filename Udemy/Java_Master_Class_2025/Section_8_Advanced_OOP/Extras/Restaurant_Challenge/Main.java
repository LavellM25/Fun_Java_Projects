package Section_8_Advanced_OOP.Extras.Restaurant_Challenge;

/** This is an OOP video lecture challenge that builds a restaurant application
 * Bill runs a fast-food chain and sells hamburger meals
 * His meal is composed of: hamburger, drink, side item
 * The challenge is to write a application to allow Bill to select the type of burgers and additional items or extras
 * that can be added to the burgers as well for pricing of this meal.
 *
 * Create other meal orders by specifying different burgers, drinks, and side items.
 *
 * The drink should have at least a type, size, price (should change depending on the size)
 * The side item needs at least a type and price.
 *
 * For burgers you need the following:
 * Every hamburger needs a burger type, base price, and max of three toppings
 * The constructor should include only the burger type and price.
 * Extra toppings on a burger need to be added somehow and priced according to their type.
 *
 * For deluxe burgers:
 * Create a deluxe burger meal that has a set price, so that any additional toppings does not change the price.
 * The deluxe burger should have room for an additional two toppings.
 *
 * Main method:
 * Create a default meal that uses the no arguments constructor.
 * Create a meal with a burger and the drink and side item of your choice with up to 3 extra toppings.
 * Create a meal with a deluxe burger where all items, drink, side item, and up to 5 extra toppings are included.
 *
 * For each meal order:
 * Add some additional toppings to the burger.
 * Change the size of the drink.
 * Print the itemized list. This should include the price of the burger, any extra toppings, the drink price based on size,
 * and the side item price.
 * Print the total due amount for the meal.
 *
 * You need a meal order:
 * This should be composed of exactly one burger, one drink and one side item.
 * The most common meal order should be created w/o arg, like a regular burger, small coke, fries (example)
 * You should be able to create other meal orders by specifying different burgers, drinks, and side items.
 *
 * You need a drink and side item:
 * The drink should have at least a type, size, and price that should change depending on size.
 * The side item needs at least a type and price.
 *
 * You need burgers:
 * Every hamburger should have a burger type, a base price, and max of three extra toppings.
 * The constructor should include only the burger type and price.
 * Extra toppings on a burger need to be added somehow and priced according to their type.
 *
 * You need deluxe burger (bonus):
 * Create a deluxe burger meal w/ deluxe burger that has a set price, so that any additional toppings do not change the price.
 * The deluxe burger should have room for additional two toppings.
 */

public class Main {

    // test methods in the main method:
    public static void main(String[] args) {
//        Item coke = new Item("drink", 1.5, "Coke");
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//        /* Result output:
//         MEDIUM COKE:  1.50
//          LARGE COKE:  2.50
//         */
//
//        Item avocado = new Item("TOPPING", 1.5, "avocado");
//        avocado.printItem();
//        /* Result output:
//                     AVOCADO:  1.50
//         */
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON","CHEESE", "MAYO");
//        burger.printItem();
        /* Output:
        2.50 (Toppings) + 4.00 (Base Price) = 6.50
         */

        /* Output after methods:  printItemizedList() and Override method of printItem() was created:
                 BASE BURGER:  4.00
                       BACON:  1.50
                      CHEESE:  1.00
                        MAYO:  0.00
----        --------------------------
              REGULAR BURGER:  6.50
         */

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.printItemizedList();
        /* Output:
                 BASE BURGER:  4.00
        ------------------------------
                 MEDIUM COKE:  1.00
                MEDIUM FRIES:  1.50
        ------------------------------
                 TOTAL PRICE:  6.50
         */
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        /* Output:
                 BASE BURGER:  4.00
                       BACON:  1.50
                      CHEESE:  1.00
                        MAYO:  0.00
           ------------------------------
                  LARGE COKE:  2.00
                MEDIUM FRIES:  1.50
           ------------------------------
                 TOTAL PRICE: 10.00
         */

//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        /* Output:
                 BASE BURGER:  4.00
                     LETTUCE:  0.00
                      CHEESE:  1.00
                        MAYO:  0.00
            ------------------------------
               TURKEY BURGER:  5.00
                  SMALL 7-UP:  0.50
                MEDIUM CHILI:  1.50
            ------------------------------
                 TOTAL PRICE:  7.00
         */

        System.out.println("=== DELUXE BURGER TEST ===");

        // 1. Create a DeluxeBurger with a set price
        DeluxeBurger deluxe = new DeluxeBurger("Angus", 8.00);

        // 2. Add 5 toppings: 3 standard, 2 deluxe
        deluxe.addToppings("BACON", "CHEESE", "LETTUCE", "FRIED EGG", "ONION RINGS");

        // 3. Print itemized list
        deluxe.printItemizedList();
        /* Expected output passed:
        === DELUXE BURGER TEST ===
         BASE BURGER:  8.00
               BACON:  0.00
              CHEESE:  0.00
             LETTUCE:  0.00
       ------------------------------
        ANGUS BURGER:  8.00
           FRIED EGG:  0.00
         ONION RINGS:  0.00
      ------------------------------
         TOTAL PRICE:  8.00

         */
    }
}
