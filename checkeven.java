
import java.util.Scanner;
public class checkeven {

    public static boolean isEven(int n){
        for(int i = 0; i<=n; i++){
            if((n % 2)==0){
                return true;
            }
            
        }
        return false;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
