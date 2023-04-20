package CompanySpecifc;
import java.util.*;

public class CountCubic {
    public static boolean cube(int n){
        for(int i=0;i<=n;i++){
            if(i*i*i==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=  in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int num = in.nextInt();
            if(cube(num)){
                count++;
            }
        }
        System.out.println(count);
    }
}
