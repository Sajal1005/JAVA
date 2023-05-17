package ST2;
import java.util.*;

public class SortArrayofStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i]=in.nextLine();
        }
        Arrays.sort(s);
        for(int i=0;i<n;i++){
            System.out.print(s[i]);
        }
    }

}
