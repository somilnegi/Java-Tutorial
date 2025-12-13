public class Selectionsort {
  public static void Selection(int a[]){
    int comparisions,shifts;
    comparisions=shifts=0;
    for(int i=0;i<a.length-1;i++){
      int min=i;
      for(int j=i+1;j<a.length;j++){

        comparisions++;
        if(a[min]>a[j]){
          min=j;
        }
      }
      int temp=a[min];
      a[min]=a[i];
      a[i]=temp;
      shifts++;
    }
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    System.out.println(comparisions+" "+shifts);
  }
  public static void main(String[] args){
    int arr[]={-13,65,-21,76,46,89,45,12};
    Selection(arr);
  }
}
