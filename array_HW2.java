// Find the maximum & minimum number in an array of integers




import java.util.*;
public class array_HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] num = new int[size];


        // input
        for(int i = 0; i<size; i++){
            num[i] = sc.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;


        // output
        for(int i = 0; i<num.length; i++){
            if(num[i] < min){
                min = num[i];
            }

            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
