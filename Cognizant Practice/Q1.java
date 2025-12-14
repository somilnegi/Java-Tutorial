import java.util.Scanner;

public class Q1 {

    public static int shipCount(int capacity, int noOfPeople) {
        int rounds = noOfPeople / capacity;
        if (noOfPeople % capacity != 0) {
            rounds++;
        }
        return rounds;
    }
    public static void main(String[] args) {
        int c, n;
        Scanner sc=new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int result = shipCount(c, n);
        System.out.println(result);
    }
}
