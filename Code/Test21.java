import java.util.*;

public class Test21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        switch (n){
            case 1:
            float r = in.nextFloat();
            System.out.println("Area of circle is "+ (3.14*r*r));
            break;
            case 2:
            float b = in.nextFloat();
            float h = in.nextFloat();
            System.out.println("Area of Triangle is "+(0.5*b*h));
            break;
            case 3:
            int side = in.nextInt();
            System.out.println("Area of Square is "+(side*side));
            break;
        }
    }
}
