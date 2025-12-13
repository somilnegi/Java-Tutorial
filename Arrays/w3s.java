public class w3s{
  public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
    int last=numbers.length-1;
    for(int i=0;i<numbers.length/2;i++){
      int temp=numbers[last];
      numbers[last]=numbers[i];
      numbers[i]=temp;
      last--;
    }
    for(int i=0;i<numbers.length;i++){
      System.out.println(numbers[i]);
    }
   }
}