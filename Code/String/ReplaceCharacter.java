package String;
import java.util.*;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char c1=in.next().charAt(0);
        char c2=in.next().charAt(0);

//        Method 1
//        s=s.replace(c1,c2);
//        System.out.println(s);

//        Method 2
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==c1){
                c[i]=c2;
            }
            System.out.print(c[i]);
        }

    }
}
