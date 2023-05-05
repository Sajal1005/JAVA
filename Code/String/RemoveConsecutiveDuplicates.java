package String;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        String s=in.nextLine();
        char[] chars = s.toCharArray();
        char c = chars[0];
        int i=1;
        while(i<chars.length){
            if(chars[i]==c){
                chars[i]='%';
                i++;
            }else{
                c=chars[i];
                i++;
            }
        }
        for(i=0;i<s.length();i++){
            if(chars[i]!='%'){
                System.out.print(chars[i]);
            }
        }
    }
}
