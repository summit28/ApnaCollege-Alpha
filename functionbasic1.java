
public class functionbasic1 {

    //check if a number is prime or not
    //only for n>=2
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //check if a number is prime or not
    public static void main(String[] args) {
        //find square root using inbuilt method in java
        // int a = 12;
        // System.out.println("square of a is : " + Math.sqrt(a));

        //check if a number is prime or not 
        System.out.println(isPrime(5));

        //function overloading using parameters
        System.out.println(sum(2, 3));
        System.out.println(sum(1, 2, 3));

    }
}
