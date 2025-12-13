import java.util.*;
public class Bubblesort{
  public static void Bubble(int a[]){
    int i;
    for(i=0;i<a.length-1;i++){
      for(int j=0;j<a.length-1-i;j++){
        if(a[j]>a[j+1]){
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
    }
    for(i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    }
  }
  public static void main(String[] args){
    int n;
    int arr[]={3,1,2,5,4};
    Bubble(arr);
  }
}
