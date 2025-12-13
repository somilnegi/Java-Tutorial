import java.util.Scanner;

public class x_Power_n {

    public static int Power(int x,int n){
        if(n==1){
            return x;
        }
        return x*Power(x, n-1);
    }
    public static void main(String... args){
        int x,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number and a power");
        x=sc.nextInt();
        n=sc.nextInt();
        int result=Power(x,n);
        System.out.println(result);
    }
}
