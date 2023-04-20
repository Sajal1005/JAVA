package CompanySpecifc;
import java.util.*;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                continue;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
