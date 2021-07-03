class BubbleSort{

    static void bubbleSorting(int arr[]){
        //cycles
        for(int i=0;i<arr.length-1;i++){
            //comparisions
            for(int j=0;j<arr.length-i-1;j++){
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[]={6,5,4,3,2,1};

        bubbleSorting(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}