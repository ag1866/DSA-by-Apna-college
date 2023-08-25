public class selection_sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        // selection sort
        // time complexity same as buble sort
        for(int i=0; i<arr.length-1; i++){
            int smallest = i; //ise apn ne wo bnaya h jo apn ne
            // chhota element assume kiya tha 

            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }// yha apn ko agr koi aur element chhota milta h as compare to that jo apn ne
                //assume kiya tha to phit naye wale element ko smallest bna denge
            }
            // swap  
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;


        }
        printArray(arr);
    }
}
