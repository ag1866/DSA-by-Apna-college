import java.util.Scanner;
public class revisionbasicjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your name");
        // String name = sc.next(); when you have to take only single word
        String name = sc.nextLine();
        System.out.println(name);
    }
}
