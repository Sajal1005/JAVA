package Stack;
import java.util.*;

public class ArrayImplementation {
    class MyStack
    {
        int top;
        int arr[] = new int[1000];
        MyStack()
        {
            top = -1;
        }
        void push(int a)
        {
            // Your code here
            arr[++top]=a;
        }
        int pop()
        {
            if(top==-1){
                return -1;
            }
            int val=arr[top--];
            return val;
        }
        int peek(){
            if(top==-1){
                return -1;
            }else{
                return arr[top];
            }
        }
        boolean empty(){
            if(top==-1){
                return true;
            }
            return false;
        }
    }
}
