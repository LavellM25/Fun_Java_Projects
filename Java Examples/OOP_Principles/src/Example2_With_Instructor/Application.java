package Example2_With_Instructor;

public class Application {
    static Person p = new Person("Lavell", "McGrone", 170, 21, 180);



    public static void main(String[] args) {
        System.out.println(p.toString());

        // Encapusaltion allows these two objects to be separated so that Travis hunter and Jim Hargbough data is not being modified
        Student s = new Student("Jim", "Harbough", 210, 54, 202, 34, "Communication");

        Student s2 = new Student("Travis", "Hunter", 190, 21, 205, 128, "Exercise Science");


        // Polymorphosism allows you to change or modify the getters and setter methods.
        s.setGraduated(); // will return true b/c it is called

        s.setFirstname("James"); // how to modify a field that are getter and fields
        System.out.println(s.toString());
        System.out.println(s2.toString());

//        s.setGraduated();

    }
}
