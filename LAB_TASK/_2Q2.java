import java.util.Scanner;

public class _2Q2 {
    public static void main(String... args){
        System.out.println("Enter the number of elements");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Initialise the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find");
        int key=sc.nextInt();
        int flag=0;
        for(int m:arr){
            if(m==key){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
