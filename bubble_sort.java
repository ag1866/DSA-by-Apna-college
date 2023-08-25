// bubble sort in ascending order
public class bubble_sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {7, 8, 3, 1, 2};
        // time complexity = O(n^2)
        // bubble sort
        for(int i = 0; i<arr.length - 1; i++){
            // arr.length - 1 isliye liya kyuki hmara sabse bda element to already sorted h 
            // isliye apn usse phle tk ek ek element sort krenge
            for (int j = 0; j<arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    // swap the element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }// i bs hmara counter index jo h wo hmara j ki position se defined hoga
        printArray(arr);
        
    }
}
// time complexity = O(n^2)