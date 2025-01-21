/* Date: 1-21-2025
   Description: Operator Precedence and operator challenge
 */

public class test {
    public static void main(String[] args) {

        // Step 1: create a variable 20.00
        double var1 = 20.00;

        // Step 2: create a variable 80.00
        double var2 = 80.00;

        // Step 3: add both numbers together and multiply by 100
        double var3 = (var1 + var2) * 100;

//        System.out.println(var3); // ensure logic is correct
        // Step 4: use remainder operator (%) to get remainder of 40
        double var4 = var3 % 40;
//        System.out.println(var4);  // output is 0

        // Step 5: create a boolean variable that assigns value true if step 4 is 0 or false otherwise.
        boolean isNoRemainder = var4 == 0; // intialize this variable to true

//        System.out.println(isNoRemainder); // make sure logic is correct

        // Step 6: write if-then statement, got some remainder if boolean in step 5 is not true

        if (!isNoRemainder ) {
            System.out.println("got some remainder");
        }

    }
}
