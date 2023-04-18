package Array;
import java.util.*;

//Frequency of digits from 0 to 9 only
//not of elements

public class FrequencyOfEle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<=9;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
