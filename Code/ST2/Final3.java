package ST2;
import java.util.*;

public class Final3 {
    public static int con(int n){
        while(!(n>=0 && n<=9)){
            int sum=0;
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            n=sum;

        }
        return n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//        for(int i=0;i<s.length();i++){
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.print(s.charAt(i));
//                break;
//            }
//        }
//        int i=0,j=1;
//        while(i<s.length() && j<s.length()){
//            if(s.charAt(i)>s.charAt(j)){
//                System.out.print(s.charAt(i));
//            }else{
//                System.out.print(s.charAt(j));
//            }
//            i+=2;
//            j+=2;
//
//        }
//        if(s.length()%2!=0){
//            System.out.print(s.charAt(s.length()-1));
//        }

//        s=s.toLowerCase();
//        StringBuffer st = new StringBuffer(s);
//        st.setCharAt(0,(char)(st.charAt(0)-32));
//        st.setCharAt(s.length()-1,(char)(st.charAt(s.length()-1)-32));
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                st.setCharAt(i-1,(char)(st.charAt(i-1)-32));
//                st.setCharAt(i+1,(char)(st.charAt(i+1)-32));
//            }
//        }
//        System.out.println(st);

//        for(int i=0;i<s.length();i++){
//            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
//                System.out.print(s.charAt(i));
//            }
//        }

//        String  s2 = "";
//        for(int i=s.length()-1;i>=0;i--){
//            s2+=(s.charAt(i));
//        }
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==s2.charAt(i)){
//                count++;
//            }
//        }
//        System.out.println(count);

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


//        int n=in.nextInt();
//        int flag=0;
//        String[] str = s.split(" ");
//        Set<String> set = new HashSet<>();
//        for(int i=0;i<str.length;i++){
//            int count=0;
//            for(int j=0;j<str.length;j++){
//                if(str[i].equals(str[j])){
//                    count++;
//                }
//            }
//            if(count>=n && !set.contains(str[i])){
//                set.add(str[i]);
//                if (flag == 0) {
//                    flag=1;
//                }else{
//                    System.out.print(" ");
//                }
//                System.out.print(str[i]);
//            }
//        }

//        int n = in.nextInt();
//        if(n%10<5){
//            n-=(n%10);
//        }else{
//            n+=(10-(n%10));
//        }
//        System.out.println(n);

//        int n = in.nextInt();
//        int sum=0;
//        for(int i=0;i<n;i++){
//            char c = in.next().charAt(0);
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(c==s.charAt(j)){
//                    count++;
//                }
//            }
//            System.out.println(count);
//            sum+=(count*((int)(c)));
//        }
//        System.out.println(sum);
//        int n = in.nextInt();
//        if(n<=0){
//            System.out.println("Invalid ID");
//            System.exit(0);
//        }
//        int sal = in.nextInt();
//        if(sal<0){
//            System.out.println("Invalid salary");
//            System.exit(0);
//        }
//        System.out.println("Data processed");

//        s=s.toLowerCase();
//        String sub = in.nextLine();
//        int count=0;
//        while(s.indexOf(sub)!=-1){
//            int n = s.indexOf(sub);
//            s=s.substring(n+1);
//            count++;
//        }
//        System.out.println(count);
//        String s2 = in.nextLine();
//        char[] chars1 = s.toCharArray();
//        char[] chars2 = s2.toCharArray();
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//        int flag=1;
//        for(int i=0;i<chars1.length;i++){
//            if(chars1[i]!=chars2[i]){
//                flag=0;
//                break;
//            }
//        }
//        if(flag==1){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        String[] str = s.split(" ");
//        for(int i=0;i<str.length;i++){
//            StringBuffer st = new StringBuffer(str[i]);
//            st.setCharAt(0,(char)(st.charAt(0)-32));
//            System.out.print(st);
//            if(i!=str.length){
//                System.out.print(" ");
//            }
//        }

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
//    }

//        String[] str = s.split(" ");
//        for(int i=0;i<str.length;i++){
//            StringBuffer st = new StringBuffer(str[i]);
//            st.setCharAt(0,(char)(st.charAt(0)-32));
//            System.out.print(st);
//            if(i!=str.length-1){
//                System.out.print(" ");
//            }
//        }

//        String sub1 = in.nextLine();
//        String sub2 = in.nextLine();
//        s=s.replace(sub1,sub2);
//        System.out.println(s);

//        s=s.toLowerCase();
//        Set<Character> set = new HashSet<>();
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
//                set.add(s.charAt(i));
//            }
//        }
//        if(set.size()==26){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        char c='#';
//        int ans=0;
//        for(int i=0;i<s.length();i++){
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)) {
//                    count++;
//                }
//            }
//            if(count>ans){
//                ans=count;
//                c=s.charAt(i);
//            }
//        }
//        System.out.println(c);

//        char c = s.charAt(0);
//        int count=0;
//        String ans="";
//        for(int i=0;i<s.length();i++){
//            if(c==s.charAt(i)){
//                count++;
//            }else{
//                ans+=c;
//                ans+=count;
//                count=1;
//                c=s.charAt(i);
//            }
//        }
//        ans+=c;
//        ans+=count;
//        System.out.println(ans);

//        String ans=s.charAt(0)+"";
//        for(int i=1;i<s.length();i++){
//            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
//                System.out.println(ans);
//                ans=s.charAt(i)+"";
//            }else{
//                ans+=s.charAt(i);
//            }
//        }
//        System.out.println(ans);

        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(con((int)(s.charAt(i))));
        }
        System.out.println(sum);
    }
}