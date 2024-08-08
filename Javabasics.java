
import java.util.*;

public class Javabasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Addition using Scannar class input from user
        //   int a = sc.nextInt();
        //   int b = sc.nextInt();
        //   int sum = a + b;
        //   int product = a * b;
        //   int sum = a * b;
        //   int product = a * b;
        //   System.out.println(product);


        //Area of Circle
        //    float rad = sc.nextFloat();
        //    float area = 3.14f * rad * rad; 
        //    System.out.println(area);


        //Type Casting
        // float a = 25.12f;
        // int b =(int) a;
        // System.err.println(b);
        // float marks = 99.999f;
        // int marks2 = (int) marks;
        // System.out.println(marks2);
        // char ch = 'Z';
        // int  number = ch;
        // System.err.println(number);

        
        //First Example 
        // float pencil = sc.nextInt();
        // float pen = sc.nextInt();
        // float eraser = sc.nextInt();
        // float totalcost  = (pencil + pen + eraser);
        // System.out.println(totalcost);
        // float totalcostwithgst = totalcost + (totalcost * 18 / 100);
        // System.err.println(totalcostwithgst);


        //Example 2
        /*  int x = 9, y = 12;
          int a = 2, b = 4, c = 6;
          int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
          System.out.println(exp);
         */


        /*Largest of two number using if else
        int a = 1;
        int b = 3;
        if(a>=b){
          System.out.println("Largest of two no is:"+a);
        } else{
          System.out.println("Largest of two no is:"+b);
        } */


        //Print if a number is odd or even number
        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        //     System.out.println("Even number");
        // } else {
        //     System.out.println("Odd number");
        // }


        // //Income tax Calculator
        // int income = sc.nextInt();
        // int tax;
        // if (income < 500000) {
        //     tax = 0;
        // } else if(income >= 500000 && income < 1000000) {
        //     tax = (int) (income * 0.2);
        // } else {
        //     tax = (int) (income * 0.3);
        // }
        // System.out.println("Your tax is: " + tax);


        //print the largest of three number
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if (a >= b && a >= c) {
        //     System.out.println("largest number is: " + a);
        // } else if (b >= c) {
        //     System.out.println("largest number is: " + b);
        // } else {
        //     System.out.println("largest number is: " + c);
        // }


        //ternary operator
        // int number = sc.nextInt();
        // String type = (number%2==0)? "even" : "odd";
        // System.out.println(type);
        //check if a student is pass or fail
        // int marks = sc.nextInt();
        // String type = (marks>=33)? "pass" : "fail";
        // System.out.println(type);


        //switch statement
        // int number = sc.nextInt();
        // switch (number) {
        //     case 1 : System.out.println("win 5kmm race"); 
        //         break;
        //     case 2 : System.out.println("win 1500m race"); 
        //         break;
        //     case 3 : System.out.println("win 100m race"); 
        //         break;
        //     default:
        //         System.out.println("I realize i'm dreaming");
        // }


        //calculator 
        // System.out.println("Enter a:");
        // int a = sc.nextInt();
        // System.out.println("Enter b:");
        // int b = sc.nextInt();
        // System.out.println("Enter Operator:");
        // char operator = sc.next().charAt(0);
        // switch (operator) {
        //     case '+': System.out.println(a + b);
        //         break;
        //     case '-': System.out.println(a - b);
        //         break;
        //     case '*': System.out.println(a * b);
        //         break;
        //     case '%': System.out.println(a % b);
        //         break;
        //     default:  System.out.println("Wrong operator");
        //         break;
        // }

        
        //leap year
        // System.out.println("Enter the year:");
        // int year = sc.nextInt();
        // boolean x = (year % 4 == 0);
        // boolean y = (year % 100 != 0);
        // boolean z = ((year % 100 == 0) && (year % 400 == 0));
        // if (x && (y || z)) {
        //     System.out.println(year + " is a leap year");
        // } else {
        //     System.out.println(year + " is not a leap year");
        // }
        sc.close();
    }
}
