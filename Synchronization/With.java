class Counter {
    static int count = 0;
     
    // Increment the counter without synchronization
    public synchronized static void setCount() {
        for (int i = 1; i <=1000; i++) {
            Counter.count++;
        }
    }
}
class MyThread extends Thread {
     
    private int threadNo;
             
    public MyThread(int threadNo) {
        this.threadNo = threadNo;
    }
     
    @Override
    public void run() {
        Counter.setCount();
        System.out.println("The thread "+threadNo+" is over.");
    }
}
 
public class With {
 
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The value of the counter is: "+Counter.count);
    }
}