import java.util.Scanner;

public class Power_of_2 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("The number is a power of 2");         
        }
        else{
            System.out.println("The number is not a power of 2");
        }

    }
}
