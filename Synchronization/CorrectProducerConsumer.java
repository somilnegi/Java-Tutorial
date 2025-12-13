//A Correct Implementation of Producer and Consumer problem
class Q {
    private int value;
    private boolean isValueAvailable = false;
 
    // Producer will call this method to produce a value
    public synchronized void produce(int value) throws InterruptedException {
        // Wait until the consumer consumes the current value
        while (isValueAvailable) {
            wait();
        }
        this.value = value;
        System.out.println("Produced: " + value);
        isValueAvailable = true;
        // Notify the consumer thread that a value has been produced
        notify();
    }
 
    // Consumer will call this method to consume a value
    public synchronized void consume() throws InterruptedException {
        // Wait until the producer provides a new value
        while (!isValueAvailable) {
            wait();
        }
        System.out.println("Consumed: " + value);
        isValueAvailable = false;
        // Notify the producer thread that the value has been consumed
        notify();
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
            e.printStackTrace();
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
            e.printStackTrace();
        }
    }
}
 
public class CorrectProducerConsumer {
    public static void main(String[] args) {
        Q sharedValue = new Q();
         
        Producer producer = new Producer(sharedValue);
        Consumer consumer = new Consumer(sharedValue);
        //Starting both the thread
        producer.start();
        consumer.start();
    }
}