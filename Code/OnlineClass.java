import java.util.*;

public class OnlineClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = in.next().charAt(0);
        }
        int m = in.nextInt();
        int mat[][] = new int[m][n];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                char c = in.next().charAt(0);
                if(c==arr[j]){
                    count++;
                }
            }
            System.out.println("Student "+i+"'s correct count is "+count);
        }
    }
}
