package CompanySpecifc;
import java.util.*;

public class Cubic {

    public static int cube(int n){
        for(int i=0;i<n;i++){
            if(i*i*i==n){
                return 0;
            }
            if(i*i*i>n){
                return (i*i*i)-n;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        if(cube(sum)==0){
            System.out.print("Yes");
        }else{
            System.out.print(cube(sum));
        }
    }
}
