// make a function to add two numbers and return the sum

import java.util.*;
public class revision_function2 {

    public static int sumOfTwoNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sumOfTwoNumber(a, b);
        System.out.println(sum);
    }
}
