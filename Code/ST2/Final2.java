package ST2;
import java.util.*;

public class Final2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

//        First Non Repeating Character
//        for(int i=0;i<s.length();i++){
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.println(s.charAt(i));
//                break;
//            }
//        }


//        Trim Spaces
//        s=s.trim();
//        System.out.println(s);



//        Adjacent pairs remove small
//        int i=0,j=1;
//        while(i<s.length() && j<s.length()){
//            if(s.charAt(i)<s.charAt(j)){
//                System.out.print(s.charAt(j));
//            }else{
//                System.out.print(s.charAt(i));
//            }
//            i+=2;
//            j+=2;
//        }
//        if(s.length()%2!=0){
//            System.out.print(s.charAt(s.length()-1));
//        }


//      Capitalizing the first and last letter of each word
//        String st = in.nextLine();
//        st=st.toLowerCase();
//        StringBuffer s = new StringBuffer(st);
//        s.setCharAt(0,(char)(s.charAt(0)-32));
//        s.setCharAt(s.length()-1,(char)(s.charAt(s.length()-1)-32));
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                s.setCharAt(i-1,(char)(s.charAt(i-1)-32));
//                s.setCharAt(i+1,(char)(s.charAt(i+1)-32));
//            }
//        }
//        System.out.println(s);


//        Remove Punctuoations
//        for(int i=0;i<s.length();i++){
//            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
//                System.out.print(s.charAt(i));
//            }
//        }


//      number of data characters that do not change position even after the data stream is reversed
//        String rev= "";
//        for(int i=s.length()-1;i>=0;i--){
//            rev+=s.charAt(i);
//        }
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==rev.charAt(i)){
//                count++;
//            }
//        }
//        System.out.println(count);


//        Sum of numbers between strings
//        int sum=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
//                int k=i;
//                while(s.charAt(i)>='0' && s.charAt(i)<='9'){
//                    i++;
//                }
//                sum+=(Integer.parseInt(s.substring(k,i)+""));
//            }
//        }
//        System.out.println(sum);


//      all the characters of the name displayed are same or not
//        char c = s.charAt(0);
//        int flag=1;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)!=c){
//                flag=0;
//            }
//        }
//        if(flag==0){
//            System.out.println("NO");
//        }else{
//            System.out.println("Yes");
//        }


//        identify the words that are repeated in the text more than or equal to N times
        int n = in.nextInt();
        int flag=0;
        Set<String> set = new HashSet<>();
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            int count=0;
            for(int j=0;j<str.length;j++){
                if(str[i].equals(str[j])){
                    count++;
                }
            }
            if(count>=n && !set.contains(str[i])){
                set.add(str[i]);
                if(flag==0){
                    System.out.print(str[i]);
                    flag=1;
                }else{
                    System.out.print(" "+str[i]);
                }
            }
        }
    }
}
