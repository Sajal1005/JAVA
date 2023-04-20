package CompanySpecifc;
import java.util.*;

public class PalindromeType {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s = in.nextLine();
        int i=0,j=s.length()-1,count=0;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                count+=2;
            }
            i++;j--;
        }
        if(s.length()%2!=0){
            count++;
        }
        System.out.println(count);
    }
}
