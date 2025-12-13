import java.util.*;
public class _2Q1 {
    public static int divisors(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println("Enter two numbers\n");
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        String result1=(divisors(x)/x)==(divisors(y)/y)?"Friendly Pair":"Not Friendly Pair";
        String result2=(divisors(x)==x)&&(divisors(y)==y)?"Abundant Numbers":"Not Abundant Numbers";
        System.out.println(result1);
        System.out.println(result2);
    }
}
