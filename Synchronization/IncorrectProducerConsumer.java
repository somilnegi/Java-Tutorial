//An incorrect implementation of a producer and consumer problem
class Q {
    private int value;
       
    // Producer will call this method to produce a value
    public synchronized void produce(int value) throws InterruptedException {
        this.value = value;
        System.out.println("Produced: " + value);     
    }
 
    // Consumer will call this method to consume a value
    public synchronized int consume() throws InterruptedException {
        System.out.println("Consumed: " + value);
        return value;
    }
}
 
class Producer extends Thread {
    private final Q sharedValue;
 
    public Producer(Q sharedValue) {
        this.sharedValue = sharedValue;
    }
 
    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                sharedValue.produce(value++);
                Thread.sleep(100); // Simulate time taken to produce
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
 
class Consumer extends Thread {
    private final Q sharedValue;
 
    public Consumer(Q sharedValue) {
        this.sharedValue = sharedValue;
    }
 
    @Override
    public void run() {
        try {
            while (true) {
                sharedValue.consume();
                Thread.sleep(150); // Simulate time taken to consume
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
 
public class IncorrectProducerConsumer {
    public static void main(String[] args) {
        Q sharedValue = new Q();
        //Creating instances of Producer and Consumer
        Producer producer = new Producer(sharedValue);
        Consumer consumer = new Consumer(sharedValue);
        //Start the thread
        producer.start();
        consumer.start();
    }
}