/** Date: 3-22-2025
 * This is similar example of static vs instance in Dog.java file
 */

package Section_7_Master_OOP.Extras;

public class Car {
    static int totalCars = 0; // Shared across all cars
    String model;             // Unique to each car

    public Car(String modelName) {
        model = modelName;
        totalCars++; // Count all cars ever created
    }

    // Instance method
    public void showModel() {
        System.out.println("Car model: " + model);
    }

    // Static method
    public static void showTotalCars() {
        System.out.println("Total cars made: " + totalCars);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota");
        Car c2 = new Car("Honda");

        c1.showModel();          // Instance method
        c2.showModel();          // Instance method
        Car.showTotalCars();     // Static method

        /*
        Output:
        c1.showModel(); Car model: Toyota
        c2.showModel(); Car model: Honda
        Car.showTotalCars(); Total cars made: 2
         */


    }
}

