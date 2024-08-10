
import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*while loop
        int counter = 0;
        while (counter<10) {
            System.out.println("Hello world");
            counter++;
        }*/

 /*print number from 1 to 10
        int counter = 1;
        while (counter <= 100) {
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();*/

 /*print number from 1 to n
        int counter = 1;
        int range = sc.nextInt();
        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();*/

 /*sum of first n natural number
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is : " + sum);*/

 /*for loop*/
        // for (int i = 1; i <= 4; i++) {
        //         System.out.println("****");
        // }
        // System.out.println("Square Pattern Printed");

        /*print reverse of a number*/
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // while (n > 0) {
        //     int reverse = n % 10;
        //     System.out.print(reverse);
        //     n = n / 10;
        // }
        // System.out.println();

        /*reverse the given number */
        // int n = 12345;
        // int reverse = 0;
        // while (n > 0) {
        //     int lastdig = n % 10;
        //     reverse = (reverse * 10) + lastdig;
        //     n = n / 10;
        // }
        // System.out.println(reverse);

        /*do while loop */
        // int counter = 1;
        // do { 
        //     System.out.println("Hello world!");
        //     counter++;
        // } while (counter<=4);

        /*break statement */
        // for (int i = 1; i <= 5; i++) {
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("i am out of the loop");

        /*keep entering a numbers till user enters a multiple of 10 */
        // do {
        //     System.out.print("Enter a number: ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) {
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);

        /*continue keyword */
        // for (int i = 1; i <= 5; i++) {
        //     if (i % 10 == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        /*display all number enter by user except multiple of 10 */
        // do {
        //     System.out.print("Enter your number: ");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println("Your number is:" +n);
        // } while (true);
        sc.close();
    }
}
