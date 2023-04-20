package CompanySpecifc;
import java.util.*;

public class PermutationSmallestLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while(n!=0){
            arr.add(n%10);
            n/=10;
        }
        Collections.sort(arr);
        int ans1=0,ans2=0;
        for(int i=0;i<arr.size();i++){
            int r = arr.get(i);
            ans1*=10;
            ans1+=r;
        }
        for(int i=arr.size()-1;i>=0;i--){
            int r = arr.get(i);
            ans2*=10;
            ans2+=r;
        }
        System.out.println(ans1+ans2);
    }
}
