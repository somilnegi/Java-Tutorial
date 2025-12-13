import java.util.*;
public class FirstUppercase {
    public static String UpperCase(String str){
        StringBuilder sbr=new StringBuilder();
        sbr.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sbr.append(str.charAt(i));
                i++;
                sbr.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sbr.append(str.charAt(i));
            }
        }
        return sbr.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println(UpperCase(str));
    }
}
