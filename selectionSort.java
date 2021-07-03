public class selectionSort {
    static void selection(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int min_index=i; 

            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }

            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,8,6,4,5};

        selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
