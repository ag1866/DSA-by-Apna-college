public class Quick_sort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high]; //pivot array ke last element ko mnliya
        int i = low-1; // i ka kam hota h isme ki pivot ke phle jitne elemnt ate h unke liye jagah banana
        for(int j = low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
// now we will swap the element to keep place for upcoming element
            
        }

        // ab sab element jo pivot se chhote the wo jagah pe agye ab pivot ko bhi to shift krna pdega 
        // to apn pivot ke element ko swap krdenge
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            // pidx=pivotindex
            int pidx = partition(arr, low, high);
            quickSort(arr,low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}
