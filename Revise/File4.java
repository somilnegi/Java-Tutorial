class Student {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }
    
}

public class File4 {
    public static void main(String[] args) {
        // String s = "Somil"; // Same as String s=new String("Somil")
        // // String is a class in java and it is immutable
        // StringBuffer sb = new StringBuffer("Somil");
        // //StringBuffer is mutable string
        // sb.append("Negi");
        // // System.out.println(sb);
        // // System.out.println(sb.length());

        // int nums[] = {8,6,7,2};
        // // for (int i = 0; i < nums.length; i++) {
        // //     System.out.println(nums[i]);
        // // }
        // for (int n : nums) {
        //     System.out.println(n);
        // }
        Student students[] = new Student[3];
        
        students[0]= new Student(4, "Somil");
        students[1]= new Student(5, "Rahul");
        students[2]= new Student(6, "Tushar");
        for (Student s : students) {
            System.out.println(s);
        }
    
    }
}
