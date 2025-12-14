import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {

    public static int compareDecimalParts(String[] arr) {
        List<Integer> decimals = new ArrayList<>();
        for (String num : arr) {
            String[] parts = num.split("\\.");
            if (parts.length > 1) {
                decimals.add(Integer.parseInt((parts[1])));
            }
        }
        int n = decimals.size();
        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < mid; i++) {
            leftSum += decimals.get(i);
        }
        for (int i = mid; i < n; i++) {
            rightSum += decimals.get(i);
        }
        return leftSum == rightSum ? 1 : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr1 = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextLine();
        }
        System.out.println(compareDecimalParts(arr1));
    }
}
