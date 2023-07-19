package BinarySearch;

public class FirstLastPosition {
    public int first(int[] arr, int target){
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
    public int last(int[] arr, int target){
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
    public int[] searchRange(int[] arr, int target) {
        int ans[] = new int[2];
        ans[0]=first(arr,target);ans[1]=last(arr,target);
        return ans;
    }
}
