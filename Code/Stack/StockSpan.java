package Stack;
import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int count = 1;
        System.out.print(1 + " ");
        for (int i = 0; i < n - 1; i++){
            if (arr[i + 1] > arr[i]) {
                count++;
            } else {
                count = 1;
            }
            System.out.print(count+" ");
        }
        System.out.print("END");
    }
}
