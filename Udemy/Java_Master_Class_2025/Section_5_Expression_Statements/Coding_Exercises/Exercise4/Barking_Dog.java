package Section_5_Expression_Statements.Coding_Exercises.Exercise4;/* Date: 1-21-2025
   Description: write a small program that can determine if you should wake up based on waken hours.
 */

// Coding exercise 4: Barking Dog

public class Barking_Dog {
    public static void main(String[] args) {
        // Test the method with different inputs
        System.out.println(shouldWakeUp(true, 23)); // Dog is barking after 22. Wake up. True

        System.out.println(shouldWakeUp(false, 23)); // Dog is not barking. Don't wake up. False

        System.out.println(shouldWakeUp(true, 8)); // Dog is barking, but it is not before 8. False

        System.out.println(shouldWakeUp(true, -1)); // Output: false. Invalid hour. Don't wake up.

        System.out.println(shouldWakeUp(true, 7)); // Dog is barking before 8. Wake up. True

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

        // Validate the range (0 to 23)
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // Check if the dog is barking and it's before 8 or after 22
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true; // Wake up
        }
        return false; // All other cases, don't wake up
    }
}

