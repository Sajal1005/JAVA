import java.util.*;

public class Tets14 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a=0,b=1;
        int n = in.nextInt();
        if(n==1){
            System.out.println(a);
        }else if(n==2){
            System.out.println(b);
        }else{
            for(int i=0;i<n-1;i++){
                int temp=b;
                b+=a;
                a=temp;
            }
            System.out.println(b);
        }
    }
}
