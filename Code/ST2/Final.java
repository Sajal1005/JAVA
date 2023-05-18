package ST2;
import java.util.*;

public class Final {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

//        Palindrome
//        int i=0,j=s.length()-1,flag=1;
//        while(i<j){
//            if(s.charAt(i)!=s.charAt(j)){
//                System.out.println(false);
//                flag=0;
//                break;
//            }
//            i++;
//            j--;
//        }
//        if(flag==1){
//            System.out.println(true);
//        }


//        Anagram
//        String s1=in.nextLine();
//        String s2=in.nextLine();
//        char arr1[] = s1.toCharArray();
//        char arr2[] = s2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        String a1 = new String(arr1);
//        String a2 = new String(arr2);
//        if(a1.equals(a2)){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }


//        Longest Word in Sentence
//        String[] str = s.split(" ");
//        int ans=0;
//        String st = "";
//        for(int i=0;i<str.length;i++){
//            if(str[i].length()>=ans){
//                ans=str[i].length();
//                st=str[i];
//            }
//        }
//        System.out.println(st);


//        Capitalizing the First Letter of Each Word
//        String[] str = s.split(" ");
//        for(int i=0;i<str.length;i++){
//            StringBuffer st = new StringBuffer(str[i]);
//            st.setCharAt(0,(char)(st.charAt(0)-32));
//            System.out.print(st);
//            if(i!=str.length-1){
//                System.out.print(" ");
//            }
//        }


//        Removing Duplicate Characters from a String
//        StringBuffer s = new StringBuffer(st);
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    s.setCharAt(j,'#');
//                }
//            }
//        }
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)!='#'){
//                System.out.print(s.charAt(i));
//            }
//        }


//        Reversing a String
//        for(int i=s.length()-1;i>=0;i--){
//            System.out.print(s.charAt(i));
//        }


//        Title Case
//        String str[] = s.split(" ");
//        for(int i=0;i<str.length;i++){
//            StringBuffer st = new StringBuffer(str[i]);
//            st.setCharAt(0,(char)(st.charAt(0)-32));
//            System.out.print(st);
//            if(i!=str.length-1){
//                System.out.print(" ");
//            }
//        }

//        Find The Most Common Character
        int ans=0;
        char c='#';
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
                if(count>ans){
                    ans=count;
                    c=s.charAt(i);
                }
            }
        }
        System.out.println(c);
    }
}
