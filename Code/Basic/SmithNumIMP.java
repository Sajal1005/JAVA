package Basic;
import java.util.*;

public class SmithNumIMP {
    public static boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num=n;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2;i<n;i++){
            if(n%i==0 && prime(i)){
                arr.add(i);
            }
        }
        int j=0,ans=0;
        while(n!=1){
            if(n%arr.get(j)==0){
                n/=arr.get(j);
                ans+=(arr.get(j));
            }else{
                j++;
            }
        }
        if(ans==num){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
