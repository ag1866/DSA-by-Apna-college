// Two numbers are entered by the user, x and n. 
// Write a function to find the value of one number raised 
// to the power of another i.e. xn


import java.util.*;
public class p9 {
    public static double findPower(int x, int n){
        return Math.pow(x, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(findPower(x, n));
    }

    
    
}
