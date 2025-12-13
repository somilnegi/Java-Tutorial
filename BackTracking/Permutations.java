import java.util.Scanner;
public class Permutations {
    public static void FindPermutations(String str, String res){
        if(str.length()==0){
            System.out.println(res);;
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String Newstr=str.substring(0,i)+str.substring(i+1,str.length());
            FindPermutations(Newstr, res+curr); 
        }
    }
    public static void main(String args[]){
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        FindPermutations(str," ");
    }
}
