package String;

import java.util.*;

public class RevrseWordsMapit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans="";

//        Method 1 => s.split(" ")
//        String[] str = s.split(" ");
//        for(int i=0;i<str.length;i++){
//            for(int j=str[i].length()-1;j>=0;j--){
//                ans+=(str[i].charAt(j));
//            }
//            if(i!= (str.length-1)){
//                ans+=' ';
//            }
//        }
//        System.out.println(ans);

//            Method 2 => Two pointers
//        int i=0,j=0;
//        while(i<s.length() && j<s.length()){
//            while(j<s.length()&&s.charAt(j)!=' '){
//                j++;
//            }
//            for(int k=j-1;k>=i;k--){
//                ans+=(s.charAt(k));
//            }
//            j++;
//            i=j;
//            ans+=' ';
//        }
//        System.out.println(ans);
    }
}
