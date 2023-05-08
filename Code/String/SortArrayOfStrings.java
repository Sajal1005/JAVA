package String;
import java.util.*;

public class SortArrayOfStrings {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str[] = new String[n];
        for(int i=0;i<n;i++){
            str[i]=in.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(str[j].compareTo(str[j+1])>0){
                    String s = str[j];
                    str[j]=str[j+1];
                    str[j+1]=s;
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
}
