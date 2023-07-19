package BinarySearch;

public class SearchinRotatedSortedArray {
    public int bs(int[] arr, int x,int low,int high){
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }else if(x>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] arr, int x) {
        int low=0,high=arr.length-1;
        while(low<high){
            int mid = low +(high-low)/2;
            if(arr[mid]>=arr[0]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        int ans = bs(arr,x,0,low-1);
        if(ans!=-1){return ans;}
        return bs(arr,x,low,arr.length-1);
    }
}
