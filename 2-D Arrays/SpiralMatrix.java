public class SpiralMatrix {
    public static void Spiral(int arr[][]){
        int SR,SC,ER,EC;
        SR=SC=0;
        ER=arr.length-1;
        EC=arr[0].length-1;
        while(SR<=ER && SC<=EC){
            for(int j=SC;j<=EC;j++){
                System.out.print(arr[SR][j]+" ");
            }
            for(int i=SR+1;i<=ER;i++){
                System.out.print(arr[i][EC]+" ");
            }
            for(int j=EC-1;j>=SC;j--){
                if(SR==ER){
                    break;
                }
                System.out.print(arr[ER][j]+" ");
            }
            for(int i=ER-1;i>=SR+1;i--){
                if(SC==EC){
                    break;
                }
                System.out.print(arr[i][SC]+" ");
            }
            SR++;
            ER--;
            SC++;
            EC--;
        }
    }
    public static void main(String []args){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24}};
        Spiral(arr);
        return;
    }
}