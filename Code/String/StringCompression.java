package String;
import java.util.*;

public class StringCompression {
    public int compress(char[] chars) {
        ArrayList<Character> arr = new ArrayList<>();
        char c = chars[0];
        int i=0,count=0;
        while(i<chars.length){
            if(chars[i]==c){
                count++;
                i++;
            }else{
                arr.add(c);
                if(count>=2 && count<=9){
                    arr.add((char)(count+48));
                }else if(count>9){
                    String num = Integer.toString(count);
                    for(int j=0;j<num.length();j++){
                        arr.add(num.charAt(j));
                    }
                }
                c=chars[i];
                count=1;
                i++;
            }
        }
        arr.add(c);
        if(count>=2 && count<=9){
            arr.add((char)(count+48));
        }else if(count>9){
            String num = Integer.toString(count);
            for(int j=0;j<num.length();j++){
                arr.add(num.charAt(j));
            }
        }
        char[] ch = new char[arr.size()];
        for(i=0;i<arr.size();i++){
            ch[i]=arr.get(i);
        }
        for(i=0;i<ch.length;i++){
            chars[i]=ch[i];
        }
        return ch.length;
    }
}
