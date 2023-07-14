package Queue;

public class ImplementUsingArray {

    public class Queue {

        int[] arr;
        int front,rear;
        Queue() {
            arr=new  int[100000];
            rear=front=0;
        }

        boolean isEmpty() {
            if(rear==front){
                return true;
            }
            return false;
        }

        void enqueue(int data) {
            if(rear==arr.length-1){
                System.out.println("Queue Overflow");
                return;
            }
            arr[rear++]=data;
        }

        int dequeue() {
            if(front==rear){
                return -1;
            }
            int val = arr[front];
            arr[front++]=-1;
            if(front==rear){
                rear=front=0;
            }
            return val;
        }

        int front() {
            if(front==rear){
                return -1;
            }
            return arr[front];
        }

    }

}
