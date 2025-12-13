import java.util.Scanner;

public class Clear_last_ith_bit {
    public static void main(String[] args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter number of bits to clear from last");
        i=sc.nextInt();
        n=n&(~0<<i);
        System.out.print("After clearing "+i+" bits from last, the number becomes "+n);
    }
}
