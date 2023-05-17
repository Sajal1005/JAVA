package ST2;
import java.util.*;

public class RotateString {
    public static String rotate(String s){
        String ans="";
        ans+=s.charAt(s.length()-1);
        ans+=(s.substring(1));
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            s=rotate(s);
        }
        System.out.println(s);
    }
}
