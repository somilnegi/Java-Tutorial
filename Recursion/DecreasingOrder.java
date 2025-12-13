import java.util.Scanner;

public class DecreasingOrder {
    public static void DecOrder(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n+" ");
        }
        DecOrder(n-1);
    }

    public static void IncOrder(int n){
        if(n==0){
            return;
        }
        IncOrder(n-1);
        System.out.print(n+" ");
    }

public static void main(String... args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        IncOrder(n);
    }
}
