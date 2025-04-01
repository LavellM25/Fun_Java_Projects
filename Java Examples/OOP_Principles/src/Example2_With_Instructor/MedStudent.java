package Example2_With_Instructor;

public class MedStudent extends Student {

    private double workhours;

    // Getter and setter methods
    public double getWorkhours() {
        return workhours;
    }

    public void setWorkhours(double workhours) {
        this.workhours = workhours;
    }

    // Here are the constructors
    public MedStudent(double studentId, String major, double workhours) {
        super(studentId, major);
        this.workhours = workhours;
    }

    public MedStudent(String firstname, String lastname, double weight, int age, double height,
                      double studentId, String major, double workhours) {
        super(firstname, lastname, weight, age, height, studentId, major);
        this.workhours = workhours;
    }
}
