package String;
import java.util.*;

public class StringCompression2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i=0,count=0;
        char c = s.charAt(0);
        while(i<s.length()){
            if(c==s.charAt(i)){
                count++;
            }else{
                if(count==1){
                    System.out.print(c);
                }else{
                    System.out.print(c+Integer.toString(count));
                }
                count=1;
                c=s.charAt(i);
            }
            i++;
        }
        if(count==1){
            System.out.print(c);
        }else{
            System.out.print(c+Integer.toString(count));
        }
    }
}
