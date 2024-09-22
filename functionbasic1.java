
public class functionbasic1 {

    //check if a number is prime or not
    //only for n>=2
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) { //optmised way to check a number is prime or not
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //prime in range
    public static void primesinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {//true
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    //Binary to Decimal Conversion
    public static void binTodec(int binNum){
        int mynum = binNum;
        int pow = 0; 
        int decNum = 0;

        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + mynum + " = " + decNum);
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
        System.out.println(isPrime(16));

        //prime in range
        primesinrange(100);

        //binary to decimal conversion
        binTodec(1010);

        //function overloading using parameters
        System.out.println(sum(2, 3));
        System.out.println(sum(1, 2, 3));

    }
}
