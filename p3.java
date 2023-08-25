// Write a function which takes in 2 numbers and
//  returns the greater of those two
import java.util.*;
public class p3 {
    public static void printGreatest(int a, int b){
        System.out.println(Math.max(a, b));
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printGreatest(a, b);
    }
}
