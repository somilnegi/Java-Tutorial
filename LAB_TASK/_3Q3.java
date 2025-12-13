import java.util.Scanner;
public class _3Q3{
    static class Student {
        private String name;
        private int roll;
        private String dept;
        Scanner sc=new Scanner(System.in);
        public void getData(){
            System.out.println("Enter name");
            name=sc.nextLine();
            System.out.println("Enter roll number");
            roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter department name");
            dept=sc.nextLine();
        }
        public void printData(){
            System.out.println("Name : "+name+", Roll number :  "+roll+" and Department : "+dept);
        }
    }
public static void main(String[] args){
    int n;
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter the number of entries to store");
    n=sc1.nextInt();
    Student[] s=new Student[n];
    System.out.println("Enter the data : ");
        for(int i=0;i<n;i++){
            s[i]= new Student();
            s[i].getData();
        }
        System.out.println("The data entered is : ");
        for(int i=0;i<n;i++){
            s[i].printData();
        }

    }
}
