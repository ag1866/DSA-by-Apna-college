// print numbers from 5 to 1
public class recursion {
    public static void printNumb(int n){
        // base case
    //     if(n == 0 ) {
    //         return;
    //     }
    // recursive case
    //     System.out.println(n);
    //     printNumb(n - 1);
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     printNumb(n);

// print numbers from 1 to 5
        // base case
        if(n == 6){
            return;
        }
        // recursive case
        System.out.println(n);
        printNumb(n + 1);
    }
    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}
