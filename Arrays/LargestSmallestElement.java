import java.util.*;
public class LargestSmallestElement {
    public static int Largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int Smallest(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int numbers[]={1,5,9,10,15,-5};
        int largest=Largest(numbers);
        int smallest=Smallest(numbers);
        System.out.println("The largest element is "+largest);
        System.out.println("The smallest element is "+smallest);
    }
}
