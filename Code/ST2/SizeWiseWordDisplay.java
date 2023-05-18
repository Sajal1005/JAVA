package ST2;
import java.util.*;

public class SizeWiseWordDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] str = s.split(" ");
        for(int i=1;i<15;i++) {
            int flag=0;
          for(int j=0;j<str.length;j++){
              if(str[j].length()==i){
                  System.out.print(str[j]+" ");
                  flag=1;
              }
          }
          if(flag==1) {
              System.out.println();
          }
        }
    }
}

