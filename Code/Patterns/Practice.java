package Patterns;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

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


        for(int i=0;i<=n/2;i++){
            for(int j=0;j<n/2-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n-n/2-1;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-2-2*i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
