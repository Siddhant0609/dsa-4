public class mergeSort {

    static void merging(int arr[], int lo,int mid, int hi){

        int leftlen=mid-lo+1;
        int rightlen=hi-mid;
        int left[]=new int[leftlen];
        int right[]=new int[rightlen];


        for(int i=0;i<leftlen;i++){
            left[i]=arr[i+lo];
        }
        for(int j=0;j<rightlen;j++){
            right[j]=arr[j+mid+1];
        }

        int k=lo;
        int i=0;
        int j=0;
        while(i<left.length && j<rightlen){
            if(left[i]>right[j]){
                arr[k]=right[j];
                j++;
                k++;
            }
            else {
                arr[k]=left[i];
                i++;
                k++;
            }
        }

        while(i<leftlen){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<rightlen){
            arr[k]=right[j];
            j++;
            k++;
        }

    }
    static void mergeSortDiv(int arr[], int lo, int hi){

        if(lo==hi){
            return;
        }
        int mid=(hi+lo)/2;

        mergeSortDiv(arr, lo, mid);
        mergeSortDiv(arr, mid+1, hi);
        merging(arr,lo,mid,hi);
    }
    public static void main(String[] args) {
        int arr[]={4,9,6,7,1,3,2,8};
        mergeSortDiv(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
