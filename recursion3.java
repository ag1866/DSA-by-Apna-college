// print the fibonacci series till nth term
// ye tarike se clear nhi hua
public class recursion3 {
    public static void printFib(int a, int b, int n){
        // base case
        if(n == 0){
            return;
        }
        // recursive 
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);// n-1 isliye liya kyuki apn ne 
        // a to print kra diya to ange ke liye ek term reduce 
        // hogyi isliye ye hogya n-1

    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n-2);
    }
}
