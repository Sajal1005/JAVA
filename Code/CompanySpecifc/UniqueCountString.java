package CompanySpecifc;
import java.util.*;

public class UniqueCountString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ans=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
