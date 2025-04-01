package Example2_With_Instructor;

public class Person {

    private String firstname;
    private String lastname;
    private double weight;
    private int age;
    private double height;


    // Getters and setter methods
    public String getFirstname() {
        return firstname;
    }

    // If you don't declare a access modifier, i.e. public, protected, private, it will be treated as private
    void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    // You are able to create a constructor that can pass in as many args as you want or none at all.
    public Person() {
    }

    // Constructor method that would take all 5 parameters
    public Person(String firstname, String lastname, double weight, int age, double height) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    // Added toString method
    // ToString() method puts what is in memory in a logical way to read what is going on.
    @Override
    public String toString() {
        return "Example2_With_Instructor.Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
