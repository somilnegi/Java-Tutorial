import java.util.*;
public class _1Q1 {
    public static void main(String args[]){
        if(args.length!=4){
            System.out.println("The number of command line arguments is more than expected number");
        }
        String name,univ_roll,course,sem;
        name=args[0];
        univ_roll=args[1];
        course=args[2];
        sem=args[3];
        System.out.println("Name : "+name+", University Roll Number : "+univ_roll+", Course : "+course+", Semester : "+sem);
    }
}
