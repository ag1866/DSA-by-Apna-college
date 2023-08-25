// Write a function that takes in the radius as input and 
// returns the circumference of a circle.

import java.util.*;
public class p4 {
    public static double printCircle(int r){
        double c = 2 * 3.14 * r;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(printCircle(r));
    }
}
