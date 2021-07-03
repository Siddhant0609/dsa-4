public class QuickSort {
    

    static int partition(int arr[] ,int lo, int hi){
        int pivot=arr[hi];
        int pivotIndex=hi;
        int left=lo;
        int right=hi-1;
        while(true){
            
            while(left<=hi && arr[left]<pivot){
                left++;
            }
            while(right>=lo && arr[right]>pivot){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            else if(left>right){
                int temp=arr[left];
                arr[left]=pivot;
                arr[pivotIndex]=temp;
                pivotIndex=left;
                break;
            }
        }
        return pivotIndex;
    } 

    static void QuickSorting(int arr[], int lo , int high){
            if(lo>=high){
                return ;
            }

        int pivotIndex=partition(arr, lo, high);
        QuickSorting(arr, lo, pivotIndex-1);
        QuickSorting(arr, pivotIndex+1, high);


    }
    public static void main(String[] args) {
        int arr[]={5,3,7,0,1,8,9,2};

        QuickSorting(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
