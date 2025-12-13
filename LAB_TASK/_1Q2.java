import java.util.Scanner;

public class _1Q2{
    public static void main(String[] args){
        int Roll;
        String Name,Dep,Univ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name, roll number, department, university name");
        Name=sc.nextLine();
        Roll=sc.nextInt();
        sc.nextLine();
        Dep=sc.nextLine();
        Univ=sc.nextLine();
        System.out.println("Enter marks of 5 subjects");
        int sum=0;
        int num;
        for(int i=0;i<5;i++){
            num=sc.nextInt();
            sum+=num;
        }
        System.out.println("Percentage = "+(float)sum/5);
    }
}
