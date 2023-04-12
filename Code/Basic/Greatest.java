package Basic;
import java.util.*;

public class Greatest {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner in = new Scanner(System.in);
        n1=in.nextInt();
        n2=in.nextInt();
        n3=in.nextInt();
        int ans = Math.max(Math.max(n1,n2),n3);
        System.out.println(ans);
    }
}
