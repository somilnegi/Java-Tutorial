import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int totalSum = 0;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = i; j > 0; j--) {
        //         totalSum += j;
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         totalSum += j;
        //     }
        // }
        int i = 1;
        int sumRow=1;
        while (i <= n) {
            totalSum += sumRow;
            sumRow += 2 * (i+1);
            i++;
        }
        System.out.println(totalSum);
    }
}
