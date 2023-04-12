package Basic;
import java.util.*;

public class Sectohrminsec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt(),sec=0,hr=0,min=0;
        if(n>=3600){
            hr=n/3600;
            n-=(hr*3600);
        }
        if(n>=60){
            min = n/60;
            n-=(min*60);
        }
        sec=n;
        System.out.println(hr+" "+min+" "+sec);
    }
}
