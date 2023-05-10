class MyThread extends Thread{
    String task;
    Mythread(String Task){
        this.task=task;
    }
    public void run(){
        System.out.println("Concurrent Thread");
    }
}
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        mt.run();
    }

}
