package String;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        String s=in.nextLine();
        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(c[i]==c[j]){
                    c[j]='%';
                }
            }
        }
        for(int i=0;i<s.length();i++){
            if(c[i]!='%'){
                System.out.print(c[i]);
            }
        }
    }
}
