// print x^n(stack height = n)
import java.util.Scanner;
public class recursion4 {
    public static int calcPower(int x, int n){
        if(n == 0){ //base case 1
            return 1;
        }
        if(x == 0){ // base case 2
            return 0;
        }
        int xPownm1 = calcPower(x, n-1);
        // n-1 isliye liya kyuki agr x ki power n-1 * x krenge 
        // to x^n hi aega
        int xPown = x * xPownm1;
        return xPown;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
