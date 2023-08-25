// transpose of a matrix

import java.util.*;
public class transposeofamatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matx = new int[rows][cols];

        // input
        // rows
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                matx[i][j] = sc.nextInt();
            }
        }

        // output
        // transpose of a matrix
        for(int j = 0; j<cols; j++){
            for(int i = 0; i<rows; i++){
                System.out.print(matx[i][j] + " ");
            }
            System.out.println();


        }

    }
}
