package Array;
import java.util.*;

public class Add_NumBy1 {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        int j=digits.length-1,carry=0;
        digits[j]++;
        while(j>=0){
            int sum=0;
            sum+=(digits[j]+carry);
            if(sum>9){
                carry=sum/10;
                digits[j]=sum%10;
            }else{
                digits[j]=sum;
                carry=0;
            }
            j--;
        }
        if(carry>0){
            int arr[] = new int[digits.length+1];
            arr[0]=carry;
            for(int i=1;i<arr.length;i++){
                arr[i]=digits[i-1];
            }
            return arr;
        }
        return digits;
    }
    public static void main(String[] args) {

    }
}
