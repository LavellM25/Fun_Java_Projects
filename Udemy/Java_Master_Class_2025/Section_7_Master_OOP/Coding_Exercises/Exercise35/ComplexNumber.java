/** Coding Exercise 35: Complex Number Operations
 * A complex number is a number that can be expressed in the form a + bi.
 * Where a and b are real numbers, and i is a solution of the equation x2 = −1.
 * Because no real number satisfies this equation, i is called an imaginary number.
 * For the complex number a + bi, a is called the real part, and b is called the imaginary part.
 * To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts.
 * For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
 *
 * Write a class with the name ComplexNumber. The class needs two fields (instance variables) with name real and imaginary of type double.
 * It represents the Complex Number.
 *
 * The class needs to have one constructor.
 * The constructor has parameters real and imaginary of type double, and it needs to initialize the fields.
 *
 * Build a class to handle addition, subtraction, and representation of complex numbers, reinforcing method overloading and object manipulation.
 */

package Section_7_Master_OOP.Coding_Exercises.Exercise35;

public class ComplexNumber {

    // Step 1:
    private double real;
    private double imaginary;

    // Step 2:
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Step 3: Write getter methods
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Step 4: Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Step 5: Method named add with one parameter of type ComplexNumber.
    // It needs to add the ComplexNumber parameter to the corresponding instance variables.

    public void add(ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    // Step 6: Method named subtract with two parameters real and imaginary of type double,
    // it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Step 7: Method named subtract with one parameter of type ComplexNumber. It needs to subtract the other parameter from this complex number.

    public void subtract(ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }


    public static void main(String[] args) {

        // All tests passed:
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal()); // Output: 2.0
        System.out.println("one.imaginary= " + one.getImaginary()); // Output: 2.0
        one.subtract(number);
        System.out.println("one.real= " + one.getReal()); // Output: -.5
        System.out.println("one.imaginary= " + one.getImaginary()); // Output: 3.5
        number.subtract(one);
        System.out.println("number.real= " + number.getReal()); // Output: 3.0
        System.out.println("number.imaginary= " + number.getImaginary()); // Output: -5.0
    }
}
