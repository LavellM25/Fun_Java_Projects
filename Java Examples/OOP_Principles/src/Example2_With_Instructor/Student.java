package Example2_With_Instructor;

public class Student extends Person {

    private double gpa;
    private double studentId;
    private String Major;
    private boolean graduated;


    // Getter and setter methods
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getStudentId() {
        return studentId;
    }

    public void setStudentId(double studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }


    public void setGraduated () {
        this.graduated = true;
    }

    public Student(double studentId, String major) {
        this.studentId = studentId;
        Major = major;
        graduated = false; // Originally in the fields, graduated was set to false, but when it is called it will be set to true.
    }

    public Student(String firstname, String lastname, double weight, int age, double height, double studentId, String major) {
        super(firstname, lastname, weight, age, height); // Calling constructor from parent class "Example2_With_Instructor.Person"
        this.studentId = studentId;
        Major = major;
        graduated = false;
    }



    @Override
    public String toString() {
        return "Example2_With_Instructor.Student{" +
                "gpa=" + gpa +
                ", studentId=" + studentId +
                ", Major='" + Major + '\'' +
                ", firstname=' " + super.getFirstname() +
                ", graduated=" + graduated +
                '}';
    }
}
