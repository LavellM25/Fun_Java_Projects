package Basics;/* Date: 1-6-2025
   Description: Create a fortune cookie that randomly generates quotes from a data structure (array).
                Utilize the random module to randomly get data from a specific amount of elements with nextInt().
 */

import java.util.Random;

public class Fortune_Cookie {
    public static void main(String[] args) {

       // Create a Array list of fortune cookie quotes to build a data structure.
       String [] fortunes = {"Love Takes Pratice",
               "What goes around comes around",
               "Out of confusion comes new patterns",
               "You will discover your hidden talents",
               "Face facts with dignity",
               "When all else seems to fail, smile for today and just love someone",
               "Believing that you are beautiful will make you appear beautiful to others around you"
       };
       //System.out.println(fortunes[5]); // Print to the console to test that the array is built correctly by printing
        // out objects in the array at a particular position.

        // Import the random module from Java library
        Random rand = new Random();
        // Going to get a random sentence from the array collection from 0 to 4 inclusively
        // then printing that elements position in the array
        //int r = rand.nextInt(5);
        //System.out.println(fortunes.length); // Prior to printing out random quotes, I wanted to get the amount of
        // elements in the array by using the length() method.
        int r = rand.nextInt(fortunes.length);
        System.out.println(fortunes[r]);


    }


}
