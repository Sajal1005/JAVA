package String;
import java.util.*;

public class HighestOccuringChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = ' ';
        int ans=0;
        String s = in.nextLine();
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>ans){
                ans=count;
                c=s.charAt(i);
            }
        }
        System.out.println(c);
    }
}
