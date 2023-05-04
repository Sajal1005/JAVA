package String;

import java.util.Scanner;

public class Palindrome {
    public static boolean pal(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        String s = in.nextLine();
        if(pal(s)){
            System.out.println("Palinndrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
