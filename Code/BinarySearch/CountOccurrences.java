package BinarySearch;

public class CountOccurrences {
    public static int first(int[] arr, int target){
        int ans=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low)+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(target>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int last(int[] arr, int target){
        int ans=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low)+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(target>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int f = first(arr, x);
        if(f==-1){return 0;}
        int l = last(arr,x);
        return l-f+1;
    }
}
