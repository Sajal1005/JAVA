import java.util.*;
public class Test17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c='a';
        int op1,op2;
        while (c!='x'){
            c=in.next().charAt(0);
            if(c=='x'){
                break;
            }
            op1 = in.nextInt();
            op2=in.nextInt();
            if(c=='+'){
                System.out.println(op1+op2);
            } else if (c == '-') {
                System.out.println(op1-op2);
            }else if(c=='*'){
                System.out.println(op1*op2);
            }else if(c=='/'){
                System.out.println(op1/op2);
            }else{
                System.out.println(op1%op2);
            }
        }
    }
}
