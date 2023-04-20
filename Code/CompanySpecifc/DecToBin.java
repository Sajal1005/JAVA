package CompanySpecifc;
import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n=in.nextInt();
        while(n!=0){
            int r=n%2;
            arr.add(r);
            n/=2;
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i));
        }
    }
}
