package Bitwise;
import java.util.*;

public class FirstSetBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int count=1,flag=0;
        while(n!=0){
            if(n%2==1){
                System.out.println(count);
                flag=1;
            }
            n/=2;
            count++;
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}
