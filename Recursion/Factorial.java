import java.util.Scanner;

public class Factorial {
    public static void main(String... args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int fact=fact(n);
        System.out.println(fact);
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
