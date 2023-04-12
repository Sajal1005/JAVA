import java.util.*;
public class Test22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=(2*n-1);i++){
            int a=n;
            for(int j=1;j<=(2*n-1);j++){
                System.out.print(a);
                if(j<i){
                    a--;
                }
                if(j>((2*n)-i-1)){
                    a++;
                }
            }
            System.out.println();
        }
    }
}
