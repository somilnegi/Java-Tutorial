class Q{
    private int value;
    private boolean isAvailable=false;
    public synchronized void produce(int value) throws InterruptedException{
        while(isAvailable){
            wait();
        }
        this.value=value;
        System.out.println("Produced : "+value);
        isAvailable=true;
        notify();
    }
    public synchronized void consume() throws InterruptedException{
        while(!isAvailable){
            wait();
        }
        System.out.println("Consumed : "+value);;
        isAvailable=false;
        notify();
    }
}
class Producer extends Thread{
    private final Q sharedValue;
    public Producer(Q sharedValue){
        this.sharedValue=sharedValue;
    }
    public void run(){
        int value=0;
        try{
            while(true){
                sharedValue.produce(value++);
                Thread.sleep(200);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Consumer extends Thread{
    private final Q sharedValue;
    public Consumer(Q sharedValue){
        this.sharedValue=sharedValue;
    }
    public void run(){
        try{
            while(true){
                sharedValue.consume();
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Q sharedValue=new Q();
        Producer p=new Producer(sharedValue);
        Consumer c=new Consumer(sharedValue);
        p.start();
        c.start();
    }
}
