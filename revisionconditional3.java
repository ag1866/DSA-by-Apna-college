import java.util.Scanner;
public class revisionconditional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press the button");
        int button = sc.nextInt();

        if(button == 1){
            System.out.println("Hello");
        } else if(button == 2){
            System.out.println("Namaste");
        } else if(button == 3){
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid button");
        }
    }
}
// ab agr aise hi 15-20 button ho to phir apn pareshan hojaenge is else likhte likhte
// to aise case main apn ek concept use krte h switch 