public class mergesort {
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int [ei - si + 1];
// +1 isliye liya kyunki jab apn index 0 se start krte to ek no. peeche jata h 
// use hi  cover krne ke liye +1 krte h apn
        int idx1 = si;
        int idx2 = mid + 1;
// +1 isliye kra kyunki ye dusre array ko track krrha h jo +1
// mid+1 se start h
        int x = 0;
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
// agr comparison khatam hogya aur agr ek array m element rhgye 
// to un elements ko likhne ke liye ek loop aur chalaenge
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
// now we will merge everyone
        for(int i = 0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }


    }
    public static void divide(int arr[], int si, int ei){
        if(si>=ei){
// aisa hoskta h ki starting index ending index se bda y barabar ajae
// to wha apn return kradenge
// si = starting index
// ei = ending index
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n-1);
        // print
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
