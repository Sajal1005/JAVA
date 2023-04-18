package Bitwise;
import java.util.*;

public class MaxBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int and=0,or=0,xor=0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if((i&j)>and && (i&j)<k){
                    and=(i&j);
                }
                if((i|j)>or && (i|j)<k){
                    or=(i|j);
                }
                if((i^j)>xor && (i^j)<k){
                    xor=(i^j);
                }
            }
        }
        System.out.println(and+"\n"+or+"\n"+xor);
    }
}
