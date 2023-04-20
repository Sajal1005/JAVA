package CompanySpecifc;
import java.util.*;

public class CountNDesired {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            char c=in.next().charAt(0);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(c==s.charAt(j)){
                    count++;
                }
            }
            ans+=((int)count*c);
        }
        System.out.println(ans);
    }
}
