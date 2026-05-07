package Sorting;

public class SearchRotateSortedArray {

    public static int Search(int arr[], int si, int tar, int ei){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        //Mid on L1
        if(arr[si] <= arr[mid]){
            //case a: left
            if(arr[si] <= tar && tar <= arr[mid]){
                return Search(arr, si, tar, mid-1);
            }else{
                // case:b 
                return Search(arr, mid+1,tar,ei);
            }
        }else{
            //mid on L2
            // case c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return Search(arr, mid+1, tar, ei);
            }else{
                // case d:left
                return Search(arr, si, tar, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        int target =0;
        int tarIdx = Search(arr,0,target, arr.length-1);
        System.out.println(tarIdx);
    }
}
