public class BinarySearch {

    static int BinarySearching(int arr[], int key, int lo, int high){

        if(lo>high){
            return -1;
        }
        int mid=(high+lo)/2;

        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            return BinarySearching(arr, key,lo,mid-1 );
        }
        else if(arr[mid]<key){
            return BinarySearching(arr, key, mid+1, high);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,8,9,10};
        int key=4;
        System.out.println(BinarySearching(arr,key,0,arr.length-1));
    }
}
