import java.util.*;
public class revision_function {

// function 
    public static void printMyName(String name){
        System.out.println(name);
        return; // iska mtlb hota h jaha se is function ke andar aap kam aye the bahar chle jaiye
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); 

        printMyName(name); // call kiya function ko
    }
}
