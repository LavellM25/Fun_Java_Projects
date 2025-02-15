package Section_6_Control_Flow;/* Date: 1-26-2025
   Description: Loop through #'s 1 to 1000 to get the sum of all numbers divisible by 3 and 5.
                Learn how for loop statements works.

 */

public class Sum3_and_5_Challenge {
    public static void main(String[] args) {

        // Loop through #'s 1 to 1000 to get the sum of all numbers divisible by 3 and 5.
        // print all #'s met the conditions.
        // break out of the loop if you have found 5 #'s that met the conditions.
        int countofMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++){
            if ((loopNumber % 3 == 0) && (loopNumber % 5== 0)){
              countofMatches++;
              sumOfMatches += loopNumber;
              System.out.println("Found a match = " + loopNumber);
            }
            if (countofMatches == 5){
                break;
            }
        }

        System.out.println("Sum= " + sumOfMatches);
    }
}
