public class whileLoopChallenge {
    public static void main(String[] args) {

//        System.out.println(isEvenNumber(6)); // test method isEvenNumber logic works.
//        System.out.println(isEvenNumber(7)); // test method isEvenNumber logic works.

        int startingValue = 5;
        int endingValue = 20;
        int evenCount = 0;
        int oddCount = 0;


        while (startingValue <= endingValue) {
            if (!isEvenNumber(startingValue)) { // call the method to determine if # is not even.
                oddCount++;
            } else { // if number is even
                System.out.println("Even number " + startingValue);
                evenCount++;
            }
            startingValue++; // increment by one.
        }

        System.out.println("Total Odd Numbers " + oddCount);
        System.out.println("Total Even Numbers " + evenCount);


    } // Determine whether a number is even or not. If number is even return true, otherwise false.
    public static boolean isEvenNumber (int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 == 0;
    }
}
