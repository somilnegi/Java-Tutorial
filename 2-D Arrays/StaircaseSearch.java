public class StaircaseSearch {
    public static boolean Search(int arr[][],int key){
        int row=arr.length-1;
        int col=0;
        while(row>=0 && col<arr[0].length){
            if(arr[row][col]==key){
                return true;
            }
            else if(arr[row][col]<key){
                col++;
            }
            else{
                row--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int array[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        if(Search(array, 31)){
            System.out.println("Key found");
        }
        else{
            System.out.println("Key not found");
        }
    }
}
