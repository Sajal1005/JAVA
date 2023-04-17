package Array;
import java.util.*;

public class CountDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        HashMap<Integer,Integer> m  =new HashMap<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1 && !m.containsKey(arr[i])){
                m.put(arr[i],count);
                System.out.println(arr[i]);
            }
        }
        System.out.println(m.size());
    }
}
