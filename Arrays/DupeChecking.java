import java.util.*;
public class DupeChecking {
    public static boolean Check(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println(Check(numbers));
    }
}
