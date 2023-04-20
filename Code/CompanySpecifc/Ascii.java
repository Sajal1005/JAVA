package CompanySpecifc;
import java.util.*;

public class Ascii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int max=-100,min=100;
        for(int i=0;i<s.length();i++){
            max = Math.max(max,((int)(s.charAt(i))));
            min = Math.min(min,((int)(s.charAt(i))));
        }
        System.out.println(max+min);
    }
}
