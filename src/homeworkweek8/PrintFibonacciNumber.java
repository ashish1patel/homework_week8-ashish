package homeworkweek8;


    /**
     * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
     */

import java.util.Scanner;

    public class PrintFibonacciNumber {


        public static void main(String[] args) {
            m1();
        }
        public static void m1(){

            Scanner sc = new Scanner(System.in);
            int t1 = 0, t2 = 1;
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();   //Declare and Initialize the number of terms
            System.out.println("First " + n + " terms of fibonnaci series: ");
            //Print the fibonacci series
            for (int i = 1; i <= n; ++i) {
                System.out.print(t1 + " ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
            sc.close();
        }
    }

