import java.util.*;

public class Test18 {
    public static void main(String[] args) {
        int a;

        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        if(a>0){
            System.out.println("Positive");
        }else if(a==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}
