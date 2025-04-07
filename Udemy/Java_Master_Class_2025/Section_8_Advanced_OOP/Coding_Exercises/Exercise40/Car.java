package Section_8_Advanced_OOP.Coding_Exercises.Exercise40;

public class Car {

    // Create the constant variables and fields that will be used later
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Create an constructor should accept two parameters, cylinders and name.
    // all of these cars have an engine and four wheels. So the other two fields should be set to default values.
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    /** Now when first creating these methods startEngine(), accelerate(), brake()
     * I originally declared with a void return type, meaning they don’t return anything—they just System.out.println(...).
     * So when I tried to test the methods in the main method, I ran into a lot of errors.  You can't print a void.
     * As a workaround, I decided to change the return type to String and not "void".
     * Given these methods are overrided in the Ford.java, Holden.java, Mitsubishi.java file, I will have to update those classes as well.
     */

    // Create a method called startEngine accepts no parameters and returns a message which says that the car's engine is starting.
    public String startEngine() {
        return "Car -> startEngine()";
    }

    // Create a method called accelerate accepts no parameters and returns a message that says the car is accelerating.
    public String accelerate() {
        return "Car -> accelerate()";
    }

    // Create a method called brake accepts no parameters and returns a message stating the car is braking.
    public String brake() {
        return "Car -> brake()";
    }

    // Two getter methods should also be defined here for the member variables cylinders and name. All methods have public access.
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
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
    }
}
