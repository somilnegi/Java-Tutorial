import java.util.*;
public class StockPrices {
    public static int MaxProfit(int arr[]){
        int profit=0;
        int buy=arr[0];
        for(int i=1;i<arr.length;i++){
            if(buy<arr[i]){
                profit=Math.max(arr[i]-buy, profit);
            }
            else{
                buy=arr[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(MaxProfit(prices));
    }
}
