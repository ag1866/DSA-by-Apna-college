// half pyramid
public class revisionpattern_3 {
    public static void main(String[] args) {
//         int n = 4;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
// // because in this pattern of half pyramid we see as much as value of i have same val
// // value j have
//             }
//             System.out.println();
//         }
//     }
// }

// inverted half pyramid
//         int n = 4;
//         for(int i = n; i>=1; i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// inverted half pyramid rotated by 180 degree
        int n = 4;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){ // this is to print spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
}

