package homeworkweek8;

import java.util.Scanner;

/**     10. Write a program to input any number and check if it Armstrong number or not
 *           153 = (1*1*1)+(5*5*5)+(3*3*3)
 *           where:
 *           (1*1*1)=1
 *           (5*5*5)=125
 *           (3*3*3)=27
 *           So:1+125+27=153
 *
 */
public class ArmstrongNumber {
  public static void Armstrong() {
      int my_input, my_temp, my_remainder, my_result;
      my_result = 0;
      //   System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      // System.out.println("A reader object has been defined ");
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      my_temp = my_input;
      while (my_temp != 0){
          my_remainder = my_temp % 10;
          my_result += Math.pow(my_remainder, 3);
          my_temp /= 10;
      }
      if(my_result == my_input)
          System.out.println(my_input + " is an Armstrong number");
      else
          System.out.println(my_input + " is not an Armstrong number");
      my_scanner.close();
  }

    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.Armstrong();
    }

}


