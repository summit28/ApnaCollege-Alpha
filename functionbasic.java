import java.util.*;

public class functionbasic {

    public static void printhelloworld() {
        System.out.println("Hello World!");
    }

    public static int calculatesum(int num1, int num2) { // parameters or formal parameters 
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        printhelloworld(); //function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b); //function call // arguments or actual parameters
        System.out.println("sum is : " + sum);
        sc.close();
    }
}
