package CollectionFrameworks;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       HashSet<String> s = new HashSet<>();
       for(int i=0;i<n;i++){
           String str = in.next();
           s.add(str);
       }
        System.out.println(s.size());
    }
}
