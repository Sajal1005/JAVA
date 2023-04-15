import java.util.*;

class Test31{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(n+" X "+i+" = "+(n*i));
//        }
//        for(int i=1;i<=10;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(j+"X"+i+"="+(j*i)+", ");
//            }
//            System.out.println();
//        }
//        int k=1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(k++ +" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(i+1);j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        double ans=0;
//        for(int i=1;i<=n;i++){
//
//            ans+=((double)(1.0/i));
//        }
//        System.out.printf("%,.6f",ans);

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*i+1);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int k=9,ans=0;
//        for(int i=1;i<=n;i++){
//            ans+=k;
//            k*=10;
//            k+=9;
//        }
//        System.out.println(ans);
//        int num=n,count=0,ans=0;
//        while(n!=0){
//            count++;
//            n/=10;
//        }
//        n=num;
//        while(n!=0){
//            int r=n%10;
//            ans+=(Math.pow(r,count));
//            n/=10;
//        }
//        if(ans==num){
//            System.out.println("Yes");
//        }else{
//            System.out.println("Np");
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*i+1);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*n-3-(2*i));j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("  ");
//            }
//            for(int j=0;j<i+1;j++){
//                char c = (char)(j+65);
//                System.out.print(c+" ");
//            }
//            for(int j=0;j<i;j++){
//                char c = (char)(i+64-j);
//                System.out.print(c+" ");
//            }
//            System.out.println();
//        }
//        int count=0,ans=0;
//        while(n!=0){
//            int r=n%10;
//            ans+=(Math.pow(2,count++)*r);
//            n/=10;
//        }
//        System.out.print(ans);
        ArrayList<Integer> arr = new ArrayList<>();
        while(n!=0){
            int r=n%2;
            arr.add(r);
            n/=2;
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i));
        }
    }
}
