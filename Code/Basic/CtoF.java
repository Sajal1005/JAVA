package Basic;
import java.util.*;

public class CtoF {
    public static void main(String[] args) {
    //        Fahrenheit to Celcius
        float f;
        Scanner in = new Scanner(System.in);
        f = in.nextFloat();
        double c = (f - 32.0)*(5.0/9.0);
        System.out.println(c);
    }
}
