import java.util.*;

class ETE{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int ans=0;
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            ans*=10;
            arr[i]=in.nextInt();
            ans+=arr[i];
        }
        ans+=1;
        ArrayList<Integer> list = new ArrayList<>();
        while(ans!=0){
            list.add(ans%10);
            ans/=10;
        }
        System.out.println(list);
    }
}
