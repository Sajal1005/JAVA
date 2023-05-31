package CollectionFrameworks;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,in.nextInt());
        }
        System.out.println(min);
    }
}
