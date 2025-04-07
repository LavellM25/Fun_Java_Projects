package Section_8_Advanced_OOP.Coding_Exercises.Exercise40;

/**
 The other three classes mentioned above are sub-classes of Car called Mitsubishi, Holden, and Ford.
 These classes have no member variables and the constructor for each will call the parent constructor for object instantiation.
 Each of these classes will override the three parent methods startEngine, accelerate, and brake.
 The return messages for these methods should somewhere contain the name of the class to which the methods belong.
 */

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}
