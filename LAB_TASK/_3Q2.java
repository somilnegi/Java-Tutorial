import java.util.Scanner;

public class _3Q2 {
    public static void main(String[] args){
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.nextLine();
        StringBuffer sbr=new StringBuffer(str);
        for(int i=0;i<sbr.length();i++){
            if(sbr.charAt(i)=='a'||sbr.charAt(i)=='e'||sbr.charAt(i)=='i'||sbr.charAt(i)=='o'||sbr.charAt(i)=='u'||sbr.charAt(i)=='A'||sbr.charAt(i)=='E'||sbr.charAt(i)=='I'||sbr.charAt(i)=='O'||sbr.charAt(i)=='U'){
                sbr.delete(i, i+1);
            }
        }
        System.out.println(sbr);
    }
}
