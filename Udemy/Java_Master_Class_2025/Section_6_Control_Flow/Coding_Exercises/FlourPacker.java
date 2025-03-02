package Section_6_Control_Flow.Coding_Exercises;

// Coding Exercise 25: Managing Flour Pack Requirements With Limited Bucket Sizes
/*
Calculate how many buckets of flour are needed to fulfill a goal weight, respecting big and small bag constraints.
 */

/**
 * Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
 *
 * The parameter bigCount represents the count of big flour bags (5 kilos each).
 *
 * The parameter smallCount represents the count of small flour bags (1 kilo each).
 *
 * The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
 *
 * Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
 * The method should return true if it is possible to make a package with goal kilos of flour.
 *
 * If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
 * For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since
 * each big bag is 5 kilos and cannot be divided.
 *
 * However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal,
 * and it's okay if there are additional bags left over.
 *
 * If any of the parameters are negative, return false.
 *
 * canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
 *
 * canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
 *
 * canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
 *
 * canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
 *
 * canPack (-3, 2, 12); should return false since bigCount is negative.
 */

public class FlourPacker {
    public static void main(String[] args) {

        // All above tests has passed in the main method.
    } public static boolean canPack (int bigCount, int smallCount, int goal) {
        // int bigCount = 5; bigCount represents the count of big flour bags (5 kilos each).
        // int smallCount = 1; smallCount represents the count of small flour bags (1 kilo each).
        // int goal = amount of kilos of flour needed to assemble a package;
        // sum of the kilos of bigCount and smallCount must be at least equal to the value of goal will equal true

        // Step 1: Handle negative values. If any parameter is negative, return false.
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Step 2: Use big bags first (each bag is 5 kg). Uses Big Bags First Without Exceeding goal
        // Math.min(goal / 5, bigCount) ensures we don’t use more big bags than available.
        int maxBigBagsUsed = Math.min(goal / 5, bigCount); // goal / 5 calculates the maximum big bags that can be used.

        // If remainingWeight is less than or equal to smallCount, return true.
        int remainingWeight = goal - (maxBigBagsUsed * 5); // remainingWeight is what still needs to be met after using big bags.


        // Step 3: Use small bags to cover the remaining weight
        return remainingWeight <= smallCount;
    }
}
