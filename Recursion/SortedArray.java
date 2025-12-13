import java.util.Scanner;

public class SortedArray {

    public static boolean Check(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return Check(a,i+1);
    }
    public static void main(String... args){
        int n;
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Initialise the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean result=Check(arr,0);
        System.out.println(result);
    }
}
