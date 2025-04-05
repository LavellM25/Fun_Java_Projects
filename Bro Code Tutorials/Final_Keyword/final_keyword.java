package Final_Keyword;

/* Date: 1-1-2025
   Description: Learning about the final keyword in Java syntax, which means once this set in front of a data type,
                there can no longer be any updates to the variable assignment. Used to permanently, assign data types
                in program you don't want to be later re-assigned.
 */

public class final_keyword {
    public static void main(String[] args) {

        final double ball = 25.07;
        // If I was to later reassign the variable ball to a different numeric value, it is going to say error,
        // "cannot assign a value to a final variable"
        // ball = 27;
        System.out.println(ball);
    }
}
