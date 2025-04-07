package Section_8_Advanced_OOP.Coding_Exercises.Exercise40;


/**
 The other three classes mentioned above are sub-classes of Car called Mitsubishi, Holden, and Ford.
 These classes have no member variables and the constructor for each will call the parent constructor for object instantiation.
 Each of these classes will override the three parent methods startEngine, accelerate, and brake.
 The return messages for these methods should somewhere contain the name of the class to which the methods belong.
 */

public class Ford extends Car {


    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    // Please see comments in Car.java file of why these methods were updated and return type of String instead of void.
    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}
