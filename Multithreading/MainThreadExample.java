public class MainThreadExample {
    public static void main(String[] args) {
        // Get the current thread which is the main thread
        Thread t = Thread.currentThread(); 
        System.out.println("Current thread: " + t);
         
        System.out.println("Current thread: " + t.getName());
        // Changing the name of the main thread
        t.setName("PrimaryThread");
        System.out.println("After name change: " + t.getName());
         
        // Output details about the main thread
        System.out.println("Main thread details: " + t);
         
     // Simple loop to demonstrate the thread execution
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(400); // Pause the main thread for 400 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
 
    }
}
