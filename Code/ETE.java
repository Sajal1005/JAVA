import java.util.*;

class ETE{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
//        int ans=0;
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            ans*=10;
//            arr[i]=in.nextInt();
//            ans+=arr[i];
//        }
//        ans+=1;
//        ArrayList<Integer> list = new ArrayList<>();
//        while(ans!=0){
//            list.add(ans%10);
//            ans/=10;
//        }
//        Collections.reverse(list);
//        System.out.println(list);
        // 5 1 2 3 8 10 11 12 14
//Add only continuity sum like 1 2 3....then break at 8 .....then again sum 10 11 12

//6
//1 2 3 5 7 8
//21 ans
//        int n = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int ans=0;
//        int flag=0;
//        for(int i=0;i<n-1;i++){
//            if(arr[i]+1==arr[i+1]){
//                if(flag==0){
//                    ans+=arr[i]+arr[i+1];
//                    flag=1;
//                }else{
//                    ans+=arr[i+1];
//                }
//            }else{
//                flag=0;
//            }
//        }
//        System.out.println(ans);

//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        int n = in.nextInt();
//        for(int i=0;i<n;i++){
//            arr.add(in.nextInt());
//        }
//        n=in.nextInt();
//        for(int i=0;i<n;i++){
//            arr.add(in.nextInt());
//        }
//        Collections.sort(arr);
//        for(int i=0;i<arr.size();i++){
//            System.out.print(arr.get(i));
//            if(i!=arr.size()-1){
//                System.out.print(" ");
//            }
//        }

//        int n = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int min=arr[0];
//        System.out.print(arr[0]+" ");
//        for(int i=1;i<n;i++){
//            if(arr[i]<min){
//                System.out.print(arr[i]+" ");
//                min=arr[i];
//            }
//        }

//        int n = in.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        while(n!=0){
//            arr.add(n%10);
//            n/=10;
//        }
//        Collections.sort(arr);
//        int ans1=0,ans2=0;
//        for(int i=0;i<arr.size();i++){
//            ans1*=10;
//            ans1+=arr.get(i);
//        }
//        for(int i=arr.size()-1;i>=0;i--){
//            ans2*=10;
//            ans2+=arr.get(i);
//        }
//        System.out.println(ans1+ans2);

//        int n = in.nextInt();
//        int arr[]= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int count=0;
//        int n1=in.nextInt();
//        int n2=in.nextInt();
//        for(int i=0;i<n;i++){
//            if(n1%arr[i]==0 && n2%arr[i]==0){
//                count++;
//            }
//        }
//        System.out.println(count);

        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        if(k>arr.length){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println(arr[n-k]);
    }
}
