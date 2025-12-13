import java.util.*;
class Bank {
    static int an=10011;
    String name,address;
    int accNo,bal;
    Scanner sc=new Scanner(System.in);
    void accNoGenerator(){
        accNo=an++;
    }
    void setInfo(){
        System.out.println("Enter name, address, account number and balance");
        name=sc.nextLine();
        address=sc.nextLine();
        accNoGenerator();
        bal=sc.nextInt();
    }
    void printInfo(){
        System.out.println(name+" "+address+" "+accNo+" "+bal);
    }
    void deposit(int n){
        bal+=n;
    }
    void withdraw(int n){
        bal-=n;
    }
    void changeAddress(){
        System.out.println("Enter the new address");
        sc.nextLine();
        address=sc.nextLine();
    }
}
public class _5Q1{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of depositors");
        n=sc.nextInt();
        Bank b[]=new Bank[n];
        System.out.println("Enter the details");
        for(int i=0;i<n;i++){
            b[i]=new Bank();
            b[i].setInfo();
        }
        System.out.println("The details of depositor 3 are :");
        b[2].printInfo();
        int m;
        System.out.println("Enter the amount to deposit");
        m=sc.nextInt();
        b[2].deposit(m);
        b[2].printInfo();
        System.out.println("Enter the amount to withdraw");
        m=sc.nextInt();
        b[2].withdraw(m);
        b[2].printInfo();
        b[2].changeAddress();
        b[2].printInfo();
    }
}
