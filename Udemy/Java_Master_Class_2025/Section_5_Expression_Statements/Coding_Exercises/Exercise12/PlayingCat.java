package Section_5_Expression_Statements.Coding_Exercises.Exercise12;

// Coding exercise 12: Playing Cat

/**
 * The objective of this coding exercise is to write a small program that can determine
 * whether the cat is engaged in playtime, based on the temperature.
 */

/**
 * The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive).
 * Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
 *
 *
 *
 * Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
 *
 * 1st parameter should be of type boolean and be named summer it represents if it is summer.
 * 2nd parameter represents the temperature and is of type int with the name temperature.
 *
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
 *
 * isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
 *
 * isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
 */

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));  // Expected: false
        System.out.println(isCatPlaying(false, 36)); // Expected: false
        System.out.println(isCatPlaying(false, 35)); // Expected: true
        System.out.println(isCatPlaying(true, 40));  // Expected: true
        System.out.println(isCatPlaying(true, 45));  // Expected: true
        System.out.println(isCatPlaying(false, 25)); // Expected: true
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        // If summer == true, then upperLimit = 45
        // If summer == false, then upperLimit = 35
        int upperLimit = summer ? 45 : 35;  // Set upper limit based on season

        // The lower limit for temperature no matter the season is 25, however the upper limit changes between
        // 45 and 35 depending on the season
        return (temperature >= 25 && temperature <= upperLimit);
    }
}
