// declaration of multidimensional array
// type[][] arrayName = new type[rows][column];
// int [][] numbers = new int[3][5]; // 2d Array



import java.util.*;
public class multidimensional_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int [][] nums = new int[rows][cols];

        // input
        // rows
        for(int i=0; i<rows; i++){
            // columns
            for(int j=0; j<cols; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        // output

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        





    }
}






















        // int [] marks; // A 1-D Array
        // int [][] flats; // A 2-D Array
        // flats = new int [2][3];
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;
        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;
    
        //     // Displaying the 2-D Array (for loop)
        // System.out.println("Printing a 2-D array using for loop");
        // for(int i=0;i<flats.length;i++){
        //     for(int j=0;j<flats[i].length;j++) {
        //         System.out.print(flats[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }
    
    //     }
    // }
    

