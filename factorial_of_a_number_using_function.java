

import java.util.*;

public class factorial_of_a_number_using_function {

    public static void printFactorial(int n){


        if(n < 0){
            System.out.println("Invalid number"); 9
        }
        // loop


        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number"); 
        int n = sc.nextInt();
        printFactorial(n);
    }
}
