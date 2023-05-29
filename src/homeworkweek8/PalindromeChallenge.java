package homeworkweek8;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 */
public class PalindromeChallenge {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;

    }

    public static void main(String[] args) {
        System.out.println("Is the Palindrome number? -  " +isPalindrome(11212));
    }
}
