package Bitwise;
import java.util.*;

public class HammingDist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();

//        SOLUTION 1
//        ArrayList<Integer> arr = new ArrayList<>();
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        while (n1!=0){
//            arr.add(n1%2);
//            n1/=2;
//        }
//        while(n2!=0){
//            arr2.add(n2%2);
//            n2/=2;
//        }
//        int count=0;
//        for(int i=0;i<Math.min(arr.size(), arr2.size());i++){
//            if(arr.get(i)!=arr2.get(i)){
//                count++;
//            }
//        }
//        if(arr.size()> arr2.size()){
//            for(int i=arr2.size();i< arr.size();i++){
//                if(arr.get(i)==1){
//                    count++;
//                }
//            }
//        }else{
//            for(int i=arr.size();i<arr2.size();i++){
//                if(arr2.get(i)==1){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

//        SOLUTION 2
        int count=0;
        while(n1!=0 && n2!=0){
            if((n1%2) !=(n2%2)){
                count++;
            }
            n1/=2;n2/=2;
        }
        if(n1!=0){
            while(n1!=0){
                if(n1%2==1){
                    count++;
                }
                n1/=2;
            }
        }else{
            while(n2!=0){
                if(n2%2==1){
                    count++;
                }
                n2/=2;
            }
        }
        System.out.println(count);
    }
}
