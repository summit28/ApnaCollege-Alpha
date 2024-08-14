//finding factorial of any number
import java.util.*;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;//to hold number
        int fact = 1;//to hold

        System.out.print("Enter any positive number : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i; //fact = 1 * 1 = 1 similar fact = 1 * 2 continue to num
        }
        System.out.println("Factoral:" + fact);
        sc.close();
    }
}
