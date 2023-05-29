package homeworkweek8;
/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
public static void number(){
    Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break;
            }
        }
    System.out.println("Minimum number: " + min);
    System.out.println("Maximum number: " + max);
    scanner.close();
}
    public static void main(String[] args) {
    number();

    }
}