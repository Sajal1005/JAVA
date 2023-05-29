import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        String str[] = s.split(" ");
        int num=0,doub=0,bool=0,words=0,special=0;
        for(int i=0;i<str.length;i++){
            if(str[i].charAt(0)>='0' && str[i].charAt(0)<='9'){
                int flag=0;
                for(int j=0;j<str[i].length();j++){
                    if(str[i].charAt(j)=='.'){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    num++;
                }else{
                    doub++;
                }
            }else if(str[i].equals("True") || str[i].equals("False")){
                bool++;
            }else if((str[i].charAt(0)>='a' && str[i].charAt(0)<='z')||(str[i].charAt(0)>='A' && str[i].charAt(0)<='Z')){
                words++;
            }else{
                special++;
            }

        }
        System.out.println("Number: "+num);
        System.out.println("Double: "+doub);
        System.out.println("Words: "+words);
        System.out.println("Boolean: "+bool);
        System.out.println("Special: "+special);

    }
}
