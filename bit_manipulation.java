// get 3rd bit(position = 3) of a number n(n=0101)
import java.util.Scanner;
public class bit_manipulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // get bit
        // int n = 5;
        // int pos = 3;
        // int bitMask = 1<<pos;
        // if((bitMask & n) == 0){
        //     System.out.println("bit was zero");
        // }else{
        //     System.out.println("bit was one");
        // }
        // Set bit
        // set 2nd bit(position = 1) of  number n(n=0101)
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);
        // Clear bit
        // clear the 3rd bit (position = 2) of a number n(n = 0101)
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);
        
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);



        // update bit
        
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        // update bit to 1 else update bit to 0
        int bitMask = 1<<pos;
        if(oper == 1){
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}