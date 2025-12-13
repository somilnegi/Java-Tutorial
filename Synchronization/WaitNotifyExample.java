class Banking {
    static public int balance = 0;
    //Method to withdraw amount
    public synchronized void withdraw(int amount){
        if(balance <= 0){
            try {
                System.out.println("Waiting for your balance to update "
                        + "before withdrawal of $"+amount);
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful. "
                + "The current balance is: $"+balance);
    }
    //Method to deposit amount
    public synchronized void deposit(int amount){
        System.out.println("We are depositing the amount $"+amount);
        balance = balance + amount;
        notify(); //Notify thread after depositing money
    }   
}
//Creating a thread to withdraw money
class BankThread1 extends Thread {
    Banking banking;
 
    public BankThread1(Banking banking) {
        this.banking = banking;
    }
 
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        banking.withdraw(1500);
    }
}
 
//Creating a thread to deposit money
class BankThread2 extends Thread {
    Banking banking;
 
    public BankThread2(Banking banking) {
        this.banking = banking;
    }
 
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        banking.deposit(5000);
    }
}
 
public class WaitNotifyExample {
    public static void main(String[] args) {
        Banking banking = new Banking();
 
        BankThread1 bThread1 = new BankThread1(banking);
        BankThread2 bThread2 = new BankThread2(banking);
        //Start both the thread
        bThread1.start(); 
        bThread2.start();
    }
 
}