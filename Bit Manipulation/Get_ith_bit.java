import java.util.*;
public class Get_ith_bit{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter the bit to find");
        int i=sc.nextInt();
        int bit=n&(1<<i);
        if(bit!=0){
            System.out.println("The "+i+" bit is 1");
        }
        else{
            System.out.println("The "+i+" bit is 0");
        }

    }
}