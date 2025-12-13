import java.util.Scanner;

public class FirstLastOccurence {

    public static int FirstOccurence(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr,i+1,key);
    }
    public static int LastOccurence(int arr[],int i,int key){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return LastOccurence(arr,i-1,key);
    }
    public static void main(String... args){
        int n;
        System.out.println("Enter the number of elements");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Initialise the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int key=sc.nextInt();
        int res1=FirstOccurence(arr,0,key);
        if(res1==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("First Occurence of element "+key+" found at index "+res1);
        }
        int res2=LastOccurence(arr,n-1,key);
        if(res2==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Last Occurence of element "+key+" found at index "+res2);
        }
    }
}
