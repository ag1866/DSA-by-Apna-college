// Write a program to print Fibonacci series of n terms 
// where n is input by user

import java.util.*;
public class p8 {
    // public static void main(String[] args) {
    //     int a = 0;
    //     int b = 1;
    //     System.out.println(a + " " + b);

    //     int c;
    //     for(int i=1; i<=15; i++){
    //         c = a + b;
    //         System.out.println(" "+c);
    //         a=b;
    //         b=c;
    //     }
        
    // }

// we can also done this program by making a function
    public static void printFib(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+ " "+b);
        int c;
        for(int i=1; i<=n; i++){
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFib(n);
    }
}