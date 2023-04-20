package CompanySpecifc;
import java.util.*;

public class MaxCount_MinCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int min=0,minc=100,max=0,maxc=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxc){
                max=arr[i];
                maxc=count;
            }
            if(count<minc){
                min=arr[i];
                minc=count;
            }
        }
        System.out.println(maxc-minc);
    }
}
