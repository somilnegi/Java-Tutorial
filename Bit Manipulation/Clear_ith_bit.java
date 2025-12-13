import java.util.Scanner;

public class Clear_ith_bit {
    public static void main(String[] args){
        int n,i,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.println("Enter the bit to remove");
        i=sc.nextInt();
        rem=n&(~(1<<i));
        System.out.println("After removing the "+i+" bit the numbre becomes "+rem);
    }
}
