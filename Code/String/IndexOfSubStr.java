package String;
import java.util.*;

public class IndexOfSubStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b= in.nextLine();
        int i=0,j=0,flag=0;
        while(i<a.length()){
            int k=i;
            if(a.charAt(i)==b.charAt(j)){
                while(i<a.length() && j<b.length() && a.charAt(i)==b.charAt(j)){
                    i++;
                    j++;
                }
                if(j==b.length()){
                    System.out.println(k);
                    flag=1;
                    break;
                }else{
                    i=k+1;
                    j=0;
                }
            }else{
                i++;
            }
            if(flag==1){
                break;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
    }
}
