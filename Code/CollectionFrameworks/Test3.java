package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=0;
        ArrayList<String> str = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = in.next();
            str.add(s);
        }
        for(int i=0;i<n;i++){
            ans=Math.max(str.get(i).length(),ans);
        }
        System.out.println(ans);
    }
}
