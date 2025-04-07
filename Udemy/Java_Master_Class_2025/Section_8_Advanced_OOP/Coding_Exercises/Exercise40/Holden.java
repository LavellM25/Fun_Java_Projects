package Section_8_Advanced_OOP.Coding_Exercises.Exercise40;

/**
 The other three classes mentioned above are sub-classes of Car called Mitsubishi, Holden, and Ford.
 These classes have no member variables and the constructor for each will call the parent constructor for object instantiation.
 Each of these classes will override the three parent methods startEngine, accelerate, and brake.
 The return messages for these methods should somewhere contain the name of the class to which the methods belong.
 */

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    /* An alternative way to write the following methods are as follows,
    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }

    Now my code below is not wrong and will get to the same solution however this alternative has the following benefits:
    getClass() → gets the runtime class of the object (e.g., Holden.class)
    .getSimpleName() → returns just the class name as a String, without the full package info

    So for Holden, it returns "Holden"
    If you used the same code in Ford, it would return "Ford" — dynamically based on the actual class.
    This way the code will be run regardless if the class name changes.

    This allows the code to be more reusable across different classes, in-case I decide to update or refactor classes
    I don't have to manually update the string everywhere which could lead to future bugs.
     */

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}
