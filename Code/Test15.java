import java.util.*;

public class Test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int count=0;
        while(n!=0){
            if(n%10 == t){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
