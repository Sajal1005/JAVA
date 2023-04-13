import java.util.*;

public class Esum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        int esum=0,osum=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(arr[i]%2==0){
                esum+=arr[i];
            }else{
                osum+=arr[i];
            }
        }
        System.out.println(esum);
        System.out.println(osum);

    }
}
