package Stack;

public class TwoStacks
{
    public class TwoStack {

        // Initialize TwoStack.
        int arr[];
        int size;
        int top1;
        int top2;
        public TwoStack(int s) {
            arr = new int[s];
            size=s;
            top1=-1;
            top2=s;
        }

        // Push in stack 1.
        public void push1(int num) {
            if((top2-top1)>1){
                arr[++top1]=num;
            }

        }

        // Push in stack 2.
        public void push2(int num) {
            if(top2-1>top1){
                arr[--top2]=num;
            }

        }

        // Pop from stack 1 and return popped element.
        public int pop1() {
            if(top1==-1){return -1;}
            int data=arr[top1--];
            return data;

        }

        // Pop from stack 2 and return popped element.
        public int pop2() {
            if(top2==size){
                return -1;
            }
            int data=arr[top2++];
            return data;

        }
    }
}
