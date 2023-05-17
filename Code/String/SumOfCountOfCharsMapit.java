package String;
import java.util.*;
//iamneo
//2
//a e
//198
public class SumOfCountOfCharsMapit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        int ans=0;
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            char c = in.next().charAt(0);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(c==s.charAt(j)){
                    count++;
                }
            }
            ans+=(count*((int)(c)));
        }
        System.out.println(ans);

    }
}
