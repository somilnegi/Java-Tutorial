class Counter implements Runnable {
    private String name;
    
    public Counter(String name) {
        this.name = name;
    }
    
    // The run method contains the code that will be executed by the thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                // Sleep for a second to simulate work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " has been interrupted.");
            }
            System.out.println(name + ": " + i);
        }
        System.out.println(name + " has finished counting.");
    }
   }
    
   public class ThreadUsingRunnable {
    public static void main(String[] args) {
        // Create instances of the Runnable object
        Counter counter1 = new Counter("Counter 1");
        Counter counter2 = new Counter("Counter 2");
    
        // Create two threads from those instances
        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);
    
        // Start the threads
        thread1.start();
        thread2.start();
    
        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
        System.out.println("Main thread has finished.");
    }
   }