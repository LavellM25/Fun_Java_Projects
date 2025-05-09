/** Date: 3-19-2025
 * Coding Exercise 30: Sum Calculator Implementation
 *
 * Write the following methods (instance methods):
 *
 * Write a class with the name SimpleCalculator.
 * The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 *
 * Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
 *
 * Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
 *
 * Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 *
 * Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
 *
 * Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
 *
 * Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
 *
 * Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
 *
 * Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
 *
 */

/* Test Code Example:
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());

OUTPUT:
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0

TIPS:
add= 9.0 is printed because 5.0 + 4 is 9.0

subtract= 1.0 is printed because 5.0 - 4 is 1.0

multiply= 0.0 is printed because 5.25 * 0 is 0.0

divide= 0.0 is printed because secondNumber is set to 0

NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 8 methods.

 */

package Section_7_Master_OOP.Coding_Exercises.Exercise30;

public class SimpleCalculator {

    /** Step 1:
     * The class needs two fields (instance variables) with names:
     * firstNumber and secondNumber both of type double.
     */

    private double firstNumber;
    private double secondNumber;

    /** Step 2: Implement Getter Methods
     * Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
     * @return value for the firstNumber
     */

    public double getFirstNumber() {
        return firstNumber;
    }

    /** Step 3: Implement Getter Methods
     * Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
     * @return value for secondNumber
     */

    public double getSecondNumber() {
        return secondNumber;
    }

     /* Key Takeaways for Step 3:
    ✅ this. ensures you are modifying the instance variable, not the method parameter.
    ✅ It is only necessary when the method parameter has the same name as the instance variable.
    ✅ Without this, Java would assume you are only modifying the parameter inside the method, not the actual field of the object.
     */

    /** Step 4: Implement Setter Methods
     * Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
     * @param firstNumber This will set the value for the firstNumber
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /** Step 5: Implement Setter Methods
     * Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber
     * @param secondNumber This will  set the value of the secondNumber field
     */

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /** Step 6: Addition
     * Method named getAdditionResult without any parameters,
     * it needs to return the result of adding the field values of firstNumber and secondNumber.
     * @return the value of the firstNumber and secondNumber added together.
     */

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    /** Step 7: Subtraction
     * Method named getSubtractionResult without any parameters,
     * it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
     * @return the value of firstNumber subtracted from the secondNumber
     */
    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    /** Step 8: Multiplication
     * Method named getMultiplicationResult without any parameters,
     * it needs to return the result of multiplying the field values of firstNumber and secondNumber.
     * @return the value of firstNumber and secondNumber multiplied.
     */
    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    /** Step 9: Division
     * Method named getDivisionResult without any parameters it needs to return the result of dividing
     * the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
     * @return the value of firstNumber divided by secondNumber if secondNumber does not equal 0 to avoid zero division error.
     */

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        else {
            return firstNumber / secondNumber;
        }
    }
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(0);
        calculator.setSecondNumber(6);

        // All tests passed for addition, subtraction, multiplication, division
//        System.out.println(calculator.getAdditionResult());
//        System.out.println(calculator.getDivisionResult());
    }
}
