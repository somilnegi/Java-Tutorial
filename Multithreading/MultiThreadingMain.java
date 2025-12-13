class ThreadingDemo extends Thread {
    private int threadNumber;
 
    public ThreadingDemo(int threadNumber) {
        this.threadNumber = threadNumber;
    }
     
    //Step-2
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                sleep(500);
                System.out.println("Thread No "+threadNumber 
                        +": iteration "+i+" is running.");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }   
        }   
        System.out.println("Exiting child thread: "+threadNumber);
    }   
}
public class MultiThreadingMain {
    public static void main(String args[]) {
        //Step-3
        ThreadingDemo t1 = new ThreadingDemo(1); //Creating a new Thread
        t1.start();
        // try {
        //     for(int i = 10; i > 0; i--) {
        //         System.out.println("Main Thread: " +"iteration "+i+" is running.");
        //         Thread.sleep(1000);
        //     }
        // } catch (InterruptedException e) {
        //     System.out.println("Main thread interrupted.");
        // }
        // try {
        //     // Main thread waits for 'thread' to finish
        //     t1.join();
        // } catch (InterruptedException e) {
        //     System.out.println("Main thread interrupted while waiting for completion.");
        // }
        System.out.println("Exiting Main thread.");
    }
}