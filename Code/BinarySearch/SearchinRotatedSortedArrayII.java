package BinarySearch;

public class SearchinRotatedSortedArrayII {
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
    public boolean search(int[] arr, int x) {
        int low=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
                low=i;
            }else{
                break;
            }
        }
        System.out.println(low);
        int ans = bs(arr,x,0,low);
        if(ans!=-1){return true;}
        if(bs(arr,x,low+1,arr.length-1)!=-1){
            return true;
        }
        return false;
    }
}
