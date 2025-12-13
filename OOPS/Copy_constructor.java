public class Copy_constructor {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Somil";
        s1.roll=32;
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
        s1.marks[2]=99;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);

    }
}

class Student{
    String name;
    int roll;
    int marks[]=new int[5];
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    Student(){

    }
}