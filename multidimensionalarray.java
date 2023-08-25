// Take a matrix as input from the user. Search for a given number x and print 
// the indices at which it occurs



import java.util.*;
public class multidimensionalarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] nums = new int[rows][cols];

        // input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();



        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                // now comparison start
                if(nums[i][j] == x){
                    System.out.println(i +" , "+ j);
                }
            }
        }


    }
}