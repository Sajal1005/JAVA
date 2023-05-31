package CollectionFrameworks;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            String s = in.next();
            ans=Math.max(s.length(),ans);
        }
        System.out.println(ans);
    }
}
