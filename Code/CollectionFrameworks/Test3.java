package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> str = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = in.next();
            str.add(s);
        }
        String s =in.next();
        for(int i=0;i<str.size();i++){
            if(str.get(i).compareTo(s)<=0){
                str.remove(i);
                i--;
            }
        }
        System.out.println(str);
    }
}
