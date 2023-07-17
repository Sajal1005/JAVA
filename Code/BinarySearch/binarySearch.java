package BinarySearch;
import java.util.*;

public class binarySearch {

//    RECURSIVE
    public int bs(int[] arr, int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid=(low)+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }else if(target>arr[mid]){
            return bs(arr,target,mid+1,high);
        }
        return bs(arr,target,low,mid-1);
    }
    public int search(int[] arr, int target) {
        return bs(arr,target,0,arr.length-1);
    }

//    ITERATIVE
    public int search2(int[] arr, int target) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low)+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
