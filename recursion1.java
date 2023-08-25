// recursive program to find sum of natural number
public class recursion1 {
    public static void printSum(int i, int n, int sum){
        // base call
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        // recursive call  
        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i); // isse kya hua ki wo kewal 4 3 2 1 
        // print krega kyuki jo 5 wali memory h usse to apn wapas
        // agye h lautke to wo delete hogyi h isliye
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
