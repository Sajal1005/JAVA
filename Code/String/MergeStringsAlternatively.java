package String;

import java.util.Scanner;

public class MergeStringsAlternatively {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.nextLine();
        String word2 = in.nextLine();
        String ans="";
        int i=0,j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                ans+=word1.charAt(i);
                i++;
            }
            if(j<word2.length()){
                ans+=word2.charAt(j);
                j++;
            }
        }
        System.out.println(ans);
    }
}
