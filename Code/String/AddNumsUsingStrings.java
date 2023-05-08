package String;

public class AddNumsUsingStrings {
    public String addStrings(String n1, String n2) {
        int i=n1.length()-1,j=n2.length()-1,carry=0;
        String ans="";
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=((int)(n1.charAt(i)-'0'));
                i--;
            }
            if(j>=0){
                sum+=((int)(n2.charAt(j)-'0'));
                j--;
            }
            ans+=(Integer.toString(sum%10));
            carry=sum/10;
        }
        if(carry>0){
            ans+=(Integer.toString(carry));
        }
        String ans2="";
        for(i=ans.length()-1;i>=0;i--){
            ans2+=ans.charAt(i);
        }
        return ans2;
    }
}
