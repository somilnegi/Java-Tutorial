import java.util.Scanner;

public class _8Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String n=sc.nextLine();
        StringBuilder num=new StringBuilder(n);
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='0'){
                num.setCharAt(i,'1');
            }
        }
        System.out.println(num);
    }
}
