package homeworkweek8;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Invalid number
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number != 0) {
            if (number < 10) {
                firstDigit = number;
            }
            number /= 10;
        }

        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));

    }
}