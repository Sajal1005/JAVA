package Basic;
import java.util.*;

public class CircleAandP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        double p = 2*Math.PI*r;
        double a = Math.PI*r*r;
        System.out.printf("Perimeter is %,.14f and area is %,.14f",p,a);
    }
}
