// make a function to check if a number is prime or not
import java.util.Scanner;


public class checkprimeconditionusingfunction {

    public static boolean numberPrime(int n){

        if(n <= 1){
            return false;
        }
        for(int i = 2; i<=n/2; i++){
            if((n % i)==0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        System.out.println(numberPrime(n));

    }
}
