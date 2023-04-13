package Basic;
import java.util.*;
public class HCFLCM {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();

//        HCF
//        int ans=1;
//        for(int i=1;i<=Math.min(n1,n2);i++){
//            if(n1%i==0 && n2%i==0){
//                ans=i;
//            }
//        }
//        System.out.println(ans);

//        LCM
        int i = Math.min(n1,n2);
        while(true){
            if(i%n1==0 && i%n2==0){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
