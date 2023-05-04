import java.util.*;

public class Test21{

    public static int sumnum(int a,int b){
        return a+b;
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr  = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>arr.get(i-1)){
                arr.remove(i);
                i--;
            }
        }
        for(int i=0;i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
