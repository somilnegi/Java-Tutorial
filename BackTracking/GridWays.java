// THIS CODE IS NOT EFFICIENT
// Time Complexity = O(2^(m+n)) which is poor
import java.util.Scanner;

public class GridWays {
    public static int findWays(int i, int j, int n, int m){
        //Base case
        if(i==n-1 && j==m-1){  //Last cell condition
            return 1;
        }
        else if(i==n||j==m){   //Boundary cross condition
            return 0;
        }
        int w1=findWays(i+1,j,n,m);
        int w2=findWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args){
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println(findWays(0,0,n,m));

    }
}
