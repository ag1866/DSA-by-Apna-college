// Write a function that calculates 
// the Greatest Common Divisor of 2 numbers

public class p7 {
    public static void printGcd(int n1, int n2){
        while(n1 != n2){
            if(n1>n2){
                n1 = n1 - n2;

            } else{
                n2 = n2 - n1;
            }
            System.out.println(printGcd(n1, n2));
            return;
        }
    }

    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 6;
        printGcd(n1, n2);
    }
}
