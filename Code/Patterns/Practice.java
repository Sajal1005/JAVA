package Patterns;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int n = in.nextInt();

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*n-1-2*i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                if((i+j)%2==0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(j+1);
//            }
//            for(int j=0;j<(n+2)-2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print(i-j+1);
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print((char)(65+i));
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-1-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print((char)(65+j));
//            }
//            for(int j=0;j<i;j++){
//                System.out.print((char)(64+i-j));
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print((char)(n+64+j-i));
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*n-2*i-2;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*n-2-2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*i+2;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<2*n-1;i++){
//            for(int j=0;j<2*n-1;j++){
//                System.out.print(n-Math.min((Math.min(i,j)),Math.min(2*n-i-2,2*n-j-2)));
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==j){
//                    System.out.print(i+1);
//                }else if(j==n-i-1){
//                    System.out.print(i+1);
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        for(int i=0;i<=n/2;i++){
//            for(int j=0;j<n/2-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<2*i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-n/2-1;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-2-2*i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        int n= in.nextInt();
//        int arr[] = new int[n];
//        int k = in.nextInt();
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[n-k]);

//        int n = in.nextInt();
//        int ans=0,count=0;
//        while(n!=0){
//            if(n%10==1){
//                ans+=(n%10* Math.pow(2,count));
//            }
//            count++;
//            n/=10;
//        }
//        System.out.println(ans);
//
//            int a=in.nextInt();
//            int b= in.nextInt();
//            int c=in.nextInt();
//            int d=in.nextInt();
//            double a1 = 0.5*a*b;
//            double a2 = 0.5*c*d;
//            System.out.printf("%.6f",Math.max(a1,a2));

        ArrayList<String> arr = new ArrayList<>();
        int n = in.nextInt();
        while(n!=3){
            if(n==1){
                arr.add(in.next());
            }else{
                System.out.println(arr);
            }
            n=in.nextInt();
        }
        }
    }
