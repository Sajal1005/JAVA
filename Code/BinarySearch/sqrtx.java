package BinarySearch;

public class sqrtx {
    public int mySqrt(int x) {
        int ans=1;
        int low=0, high=x;
        while(low<=high){
            long mid = low+ (high-low)/2;
            long sq = mid*mid;
            if(sq==x){
                return (int)(mid);
            }else if(sq<x){
                ans=(int)mid;
                low=(int)mid+1;
            }else{
                high=(int)mid-1;
            }
        }
        return ans;
    }
}
