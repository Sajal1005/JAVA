package String;

import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int i = a.length()-1,j=b.length()-1;
        int carry=0;
        String ans="";
        while(i>=0 || j>=0){
            int sum=0;
            if(i>=0){
                if(a.charAt(i)=='1'){
                    sum+=1;
                }
                i--;
            }
            if(j>=0){
                if(b.charAt(j)=='1'){
                    sum+=1;
                }
                j--;
            }
            sum+=carry;
            if(sum==0){
                ans+="0";
                carry=0;
            }else if(sum==1){
                ans+="1";
                carry=0;
            }else if(sum==2){
                ans+='0';
                carry=1;
            }else{
                ans+='1';
                carry=1;
            }
        }
        if(carry>0){
            ans+='1';
        }
        String finalans="";
        for(i=ans.length()-1;i>=0;i--){
            finalans+=ans.charAt(i);
        }
        System.out.println(finalans);
    }
}
