public class BinarySearch{
    public static int BSearch(int arr[],int n){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={10,20,30,40,50,60,70,80};
        int key=30;
        int res=BSearch(num, key);
        System.out.println((res!=-1)?("Element found at index "+res):("Element not present in array"));
    }
}