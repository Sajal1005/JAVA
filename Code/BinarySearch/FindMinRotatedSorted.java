package BinarySearch;

public class FindMinRotatedSorted {
    public int findMin(int[] arr) {
        if(arr[arr.length-1]>arr[0]){
            return arr[0];
        }
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=arr[0]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return arr[low];
    }
}
