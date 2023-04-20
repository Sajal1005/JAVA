package CompanySpecifc;
import java.util.*;

public class Pillars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int n1=in.nextInt();
        int n2= in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(n1%arr[i]==0 && n2%arr[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
