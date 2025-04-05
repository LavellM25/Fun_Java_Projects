/* Date: 1-1-2025
   Description: Working with for-each loops in Java to iterate through particular elements in an array on the console.
                The use-case for "for-each-loop" is more readable and more efficient.
 */

import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {

        // Start off with creating an array list of variables.
        ArrayList<String> basketball_players = new ArrayList<String>();
        basketball_players.add("Michael Jordan");
        basketball_players.add("Lebron James");
        basketball_players.add("Kobe Bryant");
        basketball_players.add("Anthony Edwards");
        basketball_players.add("Steph Curry");

        // This will iterate through the array list with the index of i, for each index element in the array,
        // it will display the element to the console.
        // To write a for-each-loop: for (data type(int,string,character,boolean,etc.) index(i) : name of array list)
        for(String i : basketball_players) {
            System.out.println(i);
        }

        // Using the for-each-loop is much simpler and fewer lines of code to write.
        // Using for-each-loop is helpful when working with a large collection of elements in an array.
//        System.out.println(basketball_players.get(0));
//        System.out.println(basketball_players.get(1));
//        System.out.println(basketball_players.get(2));
//        System.out.println(basketball_players.get(3));
//        System.out.println(basketball_players.get(4));
    }
}
