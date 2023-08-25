// program in java to print palindrome number


import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int r, temp, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        temp = n;

        // using while loop
        while(n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if(temp == s){
            System.out.println("Palindrome number");
        } else{
            System.out.println("Not a Plaindrome number");
        }

    }
}
