// program in java to print armstrong number

import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int rem, temp, arm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        temp = n;

        while(n>0){
            rem = n%10;
            arm += Math.pow(rem, 3);
            n /= 10;

        }

        if(temp == arm){
            System.out.println("Armstrong number");
        } else{
            System.out.println("Not a Armstrong number");
        }
    }
}
