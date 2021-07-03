public class insertionSort {
    static void insertionSort(int arr[]){

        for(int i=1;i<arr.length;i++){

            int temp=arr[i];
            int j=i-1;


            for(;j>=0;j--){
                if(temp<arr[j]){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
              arr[j+1]=temp;
            
            
        }
    }
    public static void main(String[] args) {
        int arr[]={5,2,8,9,4,6,1};

        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
