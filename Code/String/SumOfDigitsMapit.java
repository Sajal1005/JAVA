package String;
import java.util.*;
//a12c12d2 = 26
public class SumOfDigitsMapit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int k=i;
                while(i<s.length()&&(s.charAt(i)>='0' && s.charAt(i)<='9')){
                    i++;
                }
                sum+=(Integer.parseInt(s.substring(k,i)+""));
            }
        }
        System.out.println(sum);
    }
}
