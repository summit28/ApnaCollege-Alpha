
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

    public static int multiply(int p, int q) {
        int product = p * q;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoff = fact_n / (fact_r * fact_nmr);
        return binCoff;
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

        //product of p and r 
        int p = 3;
        int q = 4;
        int prod = multiply(p, q);
        System.out.println("p * q = " + prod);
        prod = multiply(10, 10);
        System.out.println("p * q = " + prod);

        //finding factorial
        System.out.println("Factoiral is : " + factorial(7));

        //finding binomial coefficent
        System.out.println("Binomial Coefficent is : " + binCoff(4, 2));
        sc.close();

    }
}
