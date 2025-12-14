import java.util.Scanner;

public class Q6 {

    public static int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProd=arr[0];
        int currMax=arr[0];
        int currMin = arr[0];
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);
            maxProd = Math.max(currMax, currMin);
        }
        return maxProd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxProduct(arr));
    }
}
