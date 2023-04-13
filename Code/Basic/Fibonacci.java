package Basic;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        if(n==1){
            System.out.print(0);
        }else if(n==2){
            System.out.print(1);
        }else{
            int a=0,b=1;
            for(int i=0;i<n-2;i++){
                int temp=b;
                b+=a;
                a=temp;
            }
            System.out.print(b);
        }
    }
}
