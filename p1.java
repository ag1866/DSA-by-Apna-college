// Enter 3 numbers from the user & make a function to print their average
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nummber 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        System.out.println("Enter number 3");
        int c = sc.nextInt();

        int avg = (a + b + c)/3;
        System.out.println(avg);
    }
}
