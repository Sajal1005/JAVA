package ST2;
import java.util.*;

public class Final2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();

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


        st=st.toLowerCase();
        StringBuffer s = new StringBuffer(st);
        s.setCharAt(0,(char)(s.charAt(0)-32));
        s.setCharAt(s.length()-1,(char)(s.charAt(s.length()-1)-32));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                s.setCharAt(i-1,(char)(s.charAt(i-1)-32));
                s.setCharAt(i+1,(char)(s.charAt(i+1)-32));
            }
        }
        System.out.println(s);
    }
}
