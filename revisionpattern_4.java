// half pyramid with numbers
public class revisionpattern_4 {
    public static void main(String[] args) {
        // int n = 5;
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
//         // }
//     }
// }
// inverted half pyramid with number
        int n = 5;
        for(int i=n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}