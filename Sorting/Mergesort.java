package Sorting;

public class Mergesort {
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Mergesorting(int arr[] , int si , int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei -si)/2;
        Mergesorting(arr, si, mid); // for left part
        Mergesorting(arr,mid+1,ei); // for right part
        merge(arr , si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si +1];
        int i = si; //Iterator for left part
        int j = mid+1; // Iterator for Right part
        int k =0 ; // iterator for temp arr;

        while(i <= mid && j<= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //Left part 
        while(i <= mid){
            temp[k++] = arr[i++];

        }
        //Right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        //Copy temp to orginal array
        for(k=0 , i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,3,1,9,4,3};
        Mergesorting(arr, 0,arr.length-1);
        printarray(arr);

    }
}
