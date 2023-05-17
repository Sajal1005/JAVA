package ST2;
import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();

//        Palindrome
//        int i=0,j=s.length()-1;
//        int flag=1;
//        while(i<j){
//            if(s.charAt(i)!=s.charAt(j)){
//                flag=0;
//                break;
//            }
//            i++;
//            j--;
//        }
//        if(flag==1){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        char c1=in.next().charAt(0);
//        char c2 = in.next().charAt(0);
//        System.out.println(s.replace(c1,c2));

//        Find ALL Substrings
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                System.out.println(s.substring(i,j+1));
            }
        }
    }
}
