import java.util.Scanner;
public class Subsets {
    public static void FindSubsets(String str, String ans, int i){
        if(i==str.length()){      //Base Class
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //Recursion Call
        FindSubsets(str,ans+str.charAt(i),i+1);    //Yes
        FindSubsets(str,ans,i+1);       //No
    }
    public static void main(String args[]){
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        FindSubsets(str," ",0);
    }
}
