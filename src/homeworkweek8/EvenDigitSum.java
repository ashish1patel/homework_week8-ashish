package homeworkweek8;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class EvenDigitSum {
    public static void getEvenDigitSum(int number) {
        int rem;
        int sum = 0;
        if (number < 0) {
            System.out.println("-1");
        } else {
            while (number > 0) {
                rem = number % 10;
                if (rem % 2 == 0) {
                    sum = sum + rem;
                }
                number = number / 10;
            }
            System.out.println("Sum of even digits in " + number + " is " + sum);
        }
    }

    public static void main(String[] args) {

        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }


}
