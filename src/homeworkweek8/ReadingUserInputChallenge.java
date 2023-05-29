package homeworkweek8;
// 1.    Read 10 numbers from the console entered by the user and print the sum of those
//       numbers
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args)
    {
        ReadingUserInputChallenge r1 =new ReadingUserInputChallenge();
        r1.hasNextInt();

    }
    public void hasNextInt()
    {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while(count <= 10) {
            System.out.println("Enter number #" + count);

            boolean validateNumber = scanner.hasNextInt();
            if(validateNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            // return new Input
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        scanner.close();
    }

}
