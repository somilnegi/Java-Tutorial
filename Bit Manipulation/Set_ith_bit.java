import java.util.Scanner;

public class Set_ith_bit {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter the bit to set");
        int i=sc.nextInt();
        int set=n|(1<<i);
        System.out.println("After setting the "+i+" bit the number becomes "+set);
    }
}
