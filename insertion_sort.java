public class insertion_sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        //  insertion sort
        for(int i=1; i<arr.length; i++){ // unsorted part
            int current = arr[i];//unsorted array main current elemnt utha liya
            int j = i - 1;//sorted part ka last index dekh rhe h
            // aur neeche loop ki help se sorted part main traverse krrhe 
            // jha condition dissatisfy hui whi apn ne unsorted se so
            // sorted main element dal diya 
            while(j >=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            // placemnt
            arr[j + 1] = current;

        }
        printArray(arr);
    }
}
