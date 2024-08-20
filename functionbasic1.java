
public class functionbasic1 {

    public static boolean isPrime(int n){
        if(n == 2){
            return  true;
        }

        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //find square root using inbuilt method in java
        // int a = 12;
        // System.out.println("square of a is : " + Math.sqrt(a));

        //check if a number is prime or not 
        System.out.println(isPrime(5));
    }
}
