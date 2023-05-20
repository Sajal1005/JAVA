package ST2;
import java.util.*;

public class MakePalindromic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1="",s2="";
        char c = '#';
        int count=0;
        char[] str = s.toCharArray();
        Arrays.sort(str);
        int flag=1;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && str[i]==str[i+1]){
                s1+=str[i];
                s2+=str[i+1];
                i++;
            }else{
                count++;
                if(count>1){
                    flag=0;
                    System.out.println("NA");
                    break;
                }
                c=str[i];
            }
        }
        if(flag==1){
            if(c!='#'){
                System.out.println(s1+" "+c+" "+s2);
            }else{
            System.out.println(s1+" "+s2);}
        }
    }
}
