import java.util.Scanner;

public class string_basics {
    public static void main(String[] args) {
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        Scanner sc = new Scanner(System.in);
    //  String st = sc.next(); this reads only first word
        String st = sc.nextLine();
        System.out.println(st);
        
    }
    
}
