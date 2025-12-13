class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started: "
                +Thread.currentThread().getName());
        try {
            // Simulating work by sleeping for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: "
                    +Thread.currentThread().getName());
        }
        System.out.println("Thread finished: "
                +Thread.currentThread().getName());
    }
}
public class isAlive_join {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();  // Start the thread  
        // Check if thread is alive
        System.out.println("Is thread alive? " + thread.isAlive());
 
        try {
            // Main thread waits for 'thread' to finish
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for completion.");
        }
        // Check again if thread is alive after join
        System.out.println("Is thread alive after join? " + thread.isAlive()); 
        System.out.println("Main Thread Exiting......");
    }
}