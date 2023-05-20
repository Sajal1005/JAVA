package ST2;
import java.util.*;

public class MultiThreading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int j = in.nextInt();
        int m = in.nextInt();
        if(j<=total){
            System.out.println("John: tickets booked: "+j);
            total-=j;
        }else{
            System.out.println("John: not booked");
        }
        if(m<=total){
            System.out.println("Mike: tickets booked: "+m);
            total-=m;
        }else{
            System.out.println("Mike: not booked");
        }
    }
}
