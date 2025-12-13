import java.util.*;
public class Palindrome {
    public static boolean Check(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        System.out.println(Check(str));
    }
}
