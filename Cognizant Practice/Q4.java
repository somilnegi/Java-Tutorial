import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q4 {

    public static int zigZagSearch(int arr[], int target) {
        Set<Integer> visited = new HashSet<>();
        int n = arr.length;
        int i = 0;
        while (i >= 0 && i < n) {
            if (arr[i] == target) {
                return i;
            }
            if (visited.contains(i)) {
                return -1;
            }
            visited.add(i);
            if (arr[i] < target) {
                i += arr[i];
            } else {
                i -= arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(zigZagSearch(arr, target));

    }
}
