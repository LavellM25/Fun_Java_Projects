package Section_6_Control_Flow.Extras;

public class DivisibleByFour {
    public static void main(String[] args) {
        int number = 20; // Test number

        // Check if the number is divisible by 4
        if (number % 4 == 0) {
            System.out.println(number + " is divisible by 4");
        } else {
            System.out.println(number + " is not divisible by 4");
        }
    }
}
