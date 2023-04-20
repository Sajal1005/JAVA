package CompanySpecifc;
import java.util.*;

public class InterchangeDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int ans=0;
        while(n!=0){
            int r=n%10;
            ans*=10;
            ans+=r;
            n/=10;
        }
        n=ans;
        ans=0;
        while(n!=0){
            arr.add(n%10);
            n/=10;
        }
        int i=0,j=1;
        while(j<arr.size()){
            System.out.print(arr.get(j));
            System.out.print(arr.get(i));
            i+=2;
            j+=2;
        }
        if(arr.size()%2!=0){
            System.out.print(arr.get(arr.size()-1));
        }
    }
}
