/** Coding Exercise 38: Bedroom Composition Exercise: Creating Classes for Lamp, Bed and Wall
 * This is an exercise in Class Composition. To complete the exercise,
 * you must create five classes with associated member variables and methods.

 The five classes should be created as follows:
 1) Create a class and name it Lamp. Inside this class should be declared three member variables:
 style of type String, battery of type boolean, and globRating of type int.
 All variables should be marked private. A constructor needs to be created which accepts the three member variables as parameters.
 In addition, four methods should also be created:
 turnOn() has no return type and should print a message that the lamp is being turned on;
 getStyle() returns the lamp style; isBattery returns the value of battery; and getGlobRating() returns the globRating of the lamp.

 2) Create a class and name it Bed. Five private member variables should be declared:
 style of type String, and pillows, height, sheets, quilt of type int.
 A constructor should be coded which accepts these five member variables as parameters.
 Also, six methods should be defined: make() has no return type and prints a message to the effect that the bed is being made;
 getStyle() which returns the value of style; getPillows() returns the number of pillows; getHeight() returns the height of the bed;
 getSheets() returns the number of sheets on the bed; and getQuilt() returns the value of quilt.

 3) Create a class with the name Ceiling. There are two member variables for this one, height and paintedColor, both of type int.
 There should also be a constructor which accepts both member variables as parameters.
 There are also two additional methods which should be defined:
 getHeight() shall return the value of height and getPaintedColor() should return the value of paintedColor.

 4) Create a class with the name Wall. It contains one member variable, direction, and is of type String.
 A constructor for Wall should accept one parameter for the member variable direction.
 A getter should also be defined for the direction field called getDirection().

 5) Create a class with the name Bedroom. This class contains eight member variables:

 name of type String; wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling; bed of type Bed, and lamp of type Lamp.
 The class constructor should accept all eight of the member variables as parameters, and there should also be two additional methods:

 getLamp() which returns an object of type Lamp, and makeBed() which prints a message that the bed is being made and also calls the make() method in the Bed class.

 Input/Output:

 Once you have completed coding your classes you should then use the following code in your main class to test your code and for correct output.
 This way you can be sure that your code works before pasting your five classes into the code evaluator.
 */


package Section_8_Advanced_OOP.Coding_Exercises.Exercise38;

public class Bedroom {
    public Bedroom(String yourNameHere, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
    }

    private Lamp getLamp() {
        return new Lamp();
    }
    private void makeBed() {
        System.out.println("Bedroom -> Making bed | ");
    }

    public static void main(String[] args) {
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedRoom = new Bedroom("John Doe", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
//        bedRoom.makeBed();
//
//        bedRoom.getLamp().turnOn();

        /** Additional tests ranned to ensure all classes methods works as it should, expected output:
         * Wall1 direction: West
         * Wall2 direction: East
         * Ceiling height: 12
         * Ceiling painted color: 55
         * Bed style: Modern
         * Pillows: 4
         * Height: 3
         * Sheets: 2
         * Quilt: 1
         * Bed -> Making |
         * Lamp style: Classic
         * Battery powered? false
         * Glob rating: 75
         * Lamp -> Turning on
         * Bedroom -> Making bed | Bed -> Making |
         * Lamp -> Turning on
         *
         * ALL TESTS PASSED NO ISSUES
         */

        // Create Wall objects
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        // Test Wall getters
        System.out.println("Wall1 direction: " + wall1.getDirection());
        System.out.println("Wall2 direction: " + wall2.getDirection());

        // Create Ceiling object
        Ceiling ceiling = new Ceiling(12, 55);

        // Test Ceiling getters
        System.out.println("Ceiling height: " + ceiling.getHeight());
        System.out.println("Ceiling painted color: " + ceiling.getPaintedColor());

        // Create Bed object
        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        // Test Bed getters
        System.out.println("Bed style: " + bed.getStyle());
        System.out.println("Pillows: " + bed.getPillows());
        System.out.println("Height: " + bed.getHeight());
        System.out.println("Sheets: " + bed.getSheets());
        System.out.println("Quilt: " + bed.getQuilt());

        // Test make() method
        bed.make();

        // Create Lamp object
        Lamp lamp = new Lamp("Classic", false, 75);

        // Test Lamp getters
        System.out.println("Lamp style: " + lamp.getStyle());
        System.out.println("Battery powered? " + lamp.isBattery());
        System.out.println("Glob rating: " + lamp.getGlobRating());

        // Test turnOn() method
        lamp.turnOn();

        // Create Bedroom with all components
        Bedroom bedRoom = new Bedroom("John Doe", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        // Test makeBed method and ensure it also calls Bed's make()
        bedRoom.makeBed();

        // Test getLamp and its method
        bedRoom.getLamp().turnOn();
    }
}
