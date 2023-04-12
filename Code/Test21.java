import java.util.*;

public class Test21{

    public static int sumnum(int a,int b){
        return a+b;
    }
    
    public static void main(String args[]){
        int a=50;
        {
            a=20;
            System.out.println(a);
        }
        System.out.println(a);
    }
}
