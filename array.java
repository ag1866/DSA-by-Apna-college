// public class array {
//     public static void main(String[] args) {
//         Declaration and memory allocation
//         int [] marks = new int[5];
//         Declaration and then memory allocation
//         int [] marks;
//         marks = new int[5];
//         marks[0] = 100;
//         marks[1] = 60;
//         marks[2] = 70;
//         marks[3] = 98;
//         marks[4] = 86;
//         System.out.println(marks[4]);
//         for (int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//         int marks[] = {97, 98, 95};
//         for(int i=0; i<3; i++) {
//             System.out.println(marks[i]);
//         }

//     }
    
// }

// take an array of names as input from the user and print them on the screen


import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size]; //ye apn ne array 
        // bnaya aur define kiya ab size jo liya h wo liya
        // jo library import krayi h usse

        // imput
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        // isme apn ne sc.nextint se ek input leliya 
        // number m 
        }
        // output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}
// aur agr apn koi bhi value na le mtlb koi input na le 
// to ye utni hi value ke liye memory allocate krlega aur 0 
// return krega
