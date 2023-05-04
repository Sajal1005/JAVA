package Array;
import java.util.*;

public class MaxCoinsBaloons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }
        int ans=0;
        for(int i=1;i<arr.size();i++){
            if(arr.size()<=2){
                break;
            }
            ans+=(arr.get(i)*arr.get(i-1)*arr.get(i+1));
            arr.remove(i);
            i--;
        }
        if(arr.size()==1){
            ans+=arr.get(0);
        }else if(arr.size()==2){
            ans+=((arr.get(0)*arr.get(1))+arr.get(1));
        }
        System.out.println(ans);
    }
}
