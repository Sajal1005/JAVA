package CompanySpecifc;
import java.util.*;

public class Jumps {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int s = in.nextInt();
        int d = in.nextInt();
        int n= in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(s+" ");
            s+=d;
        }
    }
}
