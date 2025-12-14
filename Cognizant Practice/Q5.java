import java.util.*;

class Q5 {
    
    public static int minArrSum(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int max1=arr[n-1];
        int max2=arr[n-2];
        double avg = (max1 + max2) / 2.0;
        int sum = 0;
        for (int num : arr) {
            if (num >= avg) {
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minArrSum(arr));
    }
}