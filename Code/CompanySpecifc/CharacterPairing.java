package CompanySpecifc;
import java.util.*;
public class CharacterPairing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i=0,j=1;
        while(j<s.length()){
            if(s.charAt(i)<s.charAt(j)){
                System.out.print(s.charAt(j));;
            }else{
            System.out.print(s.charAt(i));}
            i+=2;
            j+=2;
        }
        if(s.length()%2!=0){
            System.out.print(s.charAt(s.length()-1));
        }
    }
}
