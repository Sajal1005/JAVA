package ST2;
import java.util.*;

public class Reverse_Words_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            StringBuffer word = new StringBuffer(str[i]);
            System.out.println(word.reverse());
        }
    }
}
