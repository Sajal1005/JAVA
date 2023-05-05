package Array;

public class CanPlaceFlowers_IMP {
    public boolean canPlaceFlowers(int[] bed, int n) {
        if(bed.length==0){
            return false;
        }
        if(bed.length==1){
            if(bed[0]==0 && n<=1){
                return true;
            }else if(bed[0]==1 && n<=0){
                return true;
            }else{
                return false;
            }
        }
        if(n>0){
            if(bed[0]==0 && bed[1]==0){
                bed[0]=1;
                n--;
            }
        }
        for(int i=1;i<bed.length-1;i++){
            if(bed[i-1]!=1 && bed[i+1]!=1 && bed[i]==0){
                n--;
                bed[i]=1;
            }
        }
        if(n>0){
            if(bed[bed.length-1]==0 && bed[bed.length-2]==0){
                bed[bed.length-1]=1;
                n--;
            }
        }
        if(n<=0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
    }
}
