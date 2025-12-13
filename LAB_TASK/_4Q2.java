import java.util.Scanner;

class Employee{
    private String name;
    private int empId;
    private String dept;
    Scanner sc=new Scanner(System.in);
    Employee(){
        System.out.println("Enter Name");
        name=sc.nextLine();
        System.out.println("Enter Employee Id");
        empId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter department");
        dept=sc.nextLine();
    }
    public void printData(){
        System.out.println("The details are : \n"+"Name : "+name+", Employee Id : "+empId+" & Department : "+dept);
    }
    public int findId(int id){
        if(id==this.empId){
            this.printData();
            return 1;
        }
        return 0;
    }
}
public class _4Q2 {   
    public static void main(String args[]){
        System.out.println("Enter the number of enteries to store");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++){
            e[i]=new Employee();
        }
        // for(int i=0;i<n;i++){
            //     e[i].printData();
            // }
        System.out.println("Enter the Employee Id to search");
        int id=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            flag=e[i].findId(id);
        }
        if(flag==0){
            System.out.println("Employee Id not present");
        }
    }
}

