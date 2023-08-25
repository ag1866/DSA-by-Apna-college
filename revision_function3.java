// make a function to multiply two numbers and return the product

import java.util.*;
public class revision_function3 {

    public static int calculateMul(int a, int b){
        int multiply = a * b;
        return multiply;

// we can also write here return a * b;  directly
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = calculateMul(a, b);
        System.out.println(mul);

// we can directly write System.out.println(calculateMul(a, b));
    }
}
