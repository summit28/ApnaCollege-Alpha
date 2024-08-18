import java.util.*;

public class functionbasic {

    public static void printhelloworld() {
        System.out.println("Hello World!");
    }

    public static int calculatesum(int num1, int num2) { // parameters or formal parameters 
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
        System.out.println("c is " + c);
        System.out.println("d is " + d);
    }

    public static void main(String[] args) {
        printhelloworld(); //function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b); //function call // arguments or actual parameters
        System.out.println("sum is : " + sum);

        //swaping - value exchange
        int c = 2;
        int d = 4;
        swap(c, d);
        // System.out.println("c is "+ c);
        // System.out.println("d is "+ d);

        sc.close();
    }
}
