import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q7 {

    public static int lengthofLongestSubstring(String s) {
        int n = s.length();
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            while (seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthofLongestSubstring(s));
    }
}
