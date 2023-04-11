import java.util.*;

public class Test13 {
    public static void main(String[] args) {
        char c;
        Scanner in  =new Scanner(System.in);
        c = in.next().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("Lowercase");
        }else if(c>='A' && c<='Z'){
            System.out.println("Uppercase");
        }

    }
}
