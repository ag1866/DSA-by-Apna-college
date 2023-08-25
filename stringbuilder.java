// import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);


        //Set Char
        System.out.println(sb.charAt(0));

        //Get Char
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //Insert char
        sb.insert(0, 'S');
        System.out.println(sb);

        //delete char
        sb.delete(0, 1);
        System.out.println(sb);

        // append
        sb.append(" Stark");
        System.out.println(sb);

        // print length
        System.out.println(sb.length());




    }
}
