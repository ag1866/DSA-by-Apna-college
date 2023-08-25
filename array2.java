// Take an array as input from the user Search for a given number x and 
// print the index at which it occurs


import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];


        // input of size
        for(int i = 0; i<size; i++){
            number[i] = sc.nextInt();
        }

        // the number we are searching
        int x = sc.nextInt();

        // output
        for(int i = 0; i<number.length; i++){

            if(number[i] == x){
                System.out.println(i);
            }
            
        }
    }
    

}
