
public class ThreadPriorityExample extends Thread {
 
    public ThreadPriorityExample(String name) {
        super(name); // Set the name of the thread
    }
 
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + " with priority "
                    + this.getPriority() + " Loop " + i);
            try {
                Thread.sleep(500); // Sleep for a half second
            } catch (InterruptedException e) {
                System.err.println(this.getName() + " interrupted.");
            }
        }
        System.out.println(this.getName() + " finished.");
    }
 
    public static void main(String[] args) {
        ThreadPriorityExample t1 = new ThreadPriorityExample("Low Priority Thread");
        ThreadPriorityExample t2 = new ThreadPriorityExample("Normal Priority Thread");
        ThreadPriorityExample t3 = new ThreadPriorityExample("High Priority Thread");
 
        // Set priorities for all threads
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
 
        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}