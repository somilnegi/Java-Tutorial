import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s1:");
        String s1 = sc.nextLine();
        System.out.println("Enter string s2:");
        String s2 = sc.nextLine();
        System.out.println("Enter a character:");
        char var = sc.next().charAt(0);
        int flag = 0;
        int idx1 = s1.indexOf(var);
        if (idx1 != -1) {
            System.out.println("Index of " + var + " in s1 is " + idx1);
        }
        int idx2 = s2.indexOf(var);
        if (idx2 != -1) {
            System.out.println("Index of " + var + " in s2 is " + idx2);
        }
        System.out.println("Enter an index:");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < s1.length()) {
            System.out.println("The character at index " + idx + " of s1 is " + s1.charAt(idx));
        } else {
            System.out.println("Index " + idx + " is out of bounds for s1");
        }
        if (idx >= 0 && idx < s2.length()) {
            System.out.println("The character at index " + idx + " of s2 is " + s2.charAt(idx));
        } else {
            System.out.println("Index " + idx + " is out of bounds for s2");
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char ch : s1.toCharArray()) {
            sb1.append(Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
        }
        for (char ch : s2.toCharArray()) {
            sb2.append(Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
        }
        System.out.println("Toggled s1: " + sb1);
        System.out.println("Toggled s2: " + sb2);
        System.out.println(s1.equals(s2) ? "Strings are equal" : "Strings are not equal");
        System.out.println(s1.contains(s2) ? "s2 is a substring of s1" : "s2 is not a substring of s1");
    }
}
