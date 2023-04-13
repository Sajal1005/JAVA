package Patterns;
import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


//        1.
//        *****
//        *****
//        *****
//        *****
//        *****
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        2.
//        *
//        **
//        ***
//        ****
//        *****
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        3.
//        *****
//        ****
//        ***
//        **
//        *
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        4.
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print((j+1)+" ");
//            }
//            System.out.println();
//        }

//        5.
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
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

//            6.
//             *
//            **
//           ***
//          ****
//         *****
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        7.
//     *****
//      ****
//       ***
//        **
//         *
//    for(int i=0;i<n;i++){
//        for(int j=0;j<i;j++){
//            System.out.print(" ");
//        }
//        for(int j=0;j<n-i;j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }

//            8.
//            *
//           ***
//          *****
//         *******
//        *********
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*i)+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        9. imp
//    *********
//     *******
//      *****
//       ***
//        *
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*n-(2*i)-1);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        10.
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        11.
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        12.
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        13. imp
//         *
//        * *
//       *   *
//      *     *
//     *********
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*i)+1;j++){
//                if(i==0 || j==0 || i==n-1 || j==(2*i)){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        14. imp
//     *********
//      *     *
//       *   *
//        * *
//         *
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*n-1-(2*i));j++){
//                if(i==0 || j==0 || i==n-1 || j==((2*n)-(2*i)-2)){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        15.
//         *
//        * *
//       *   *
//      *     *
//     *       *
//      *     *
//       *   *
//        * *
//         *
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*i)+1;j++){
//                if(i==0 || j==0 || j==(2*i)){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<(2*n)-3-(2*i);j++){
//                if(j==0 || j==(2*n)-4-(2*i) || j==0){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        17.
//        1
//       212
//      32123
//     4321234
//      32123
//       212
//        1
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print(i+1-j);
//            }
//            for(int j=0;j<i;j++){
//                System.out.print(2+j);
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(n-1-i-j);
//            }
//            for(int j=0;j<n-i-2;j++){
//                System.out.print(2+j);
//            }
//            System.out.println();
//        }

//        18.
//      **********
//      ****  ****
//      ***    ***
//      **      **
//      *        *
//      *        *
//      **      **
//      ***    ***
//      ****  ****
//      **********
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
//            for(int j=0;j<(2*n-2*i-2);j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        19.
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<(2*n-2-(2*i));j++){
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
//            for(int j=0;j<2*(i+1);j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<n-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int k = 1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print((k++)+" ");
//            }
//            System.out.println();
//        }

//        22.
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                if((i+j)%2==0){
//                    System.out.print(1+" ");
//                }else{
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }


//        24.
//       *        *
//       **      **
//       * *    * *
//       *  *  *  *
//       *   **   *
//       *   **   *
//       *  *  *  *
//       * *    * *
//       **      **
//       *        *
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(i==0 || j==0 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<(2*n)-2-(2*i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                if(i==0 || j==0 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(i==n-1 || j==0 || j==n-i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                if(i==n-1 || j==0 || j==n-i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
