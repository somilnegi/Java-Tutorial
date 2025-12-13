import java.util.Scanner;
public class Update_ith_bit {
    public static void main(String[] args){
        int n,i,bit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter the bit to update");
        i=sc.nextInt();
        System.out.println("Enter 0 or 1");
        bit=sc.nextInt();
        if(bit==0){
            n=n&(~(1<<i));
        }
        else{
            n=n|(1<<i);
        }
        System.out.println("After updating the "+i+" bit the value becomes "+n);
    }
}
