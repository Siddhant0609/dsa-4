class FirstLoop {
    public static void main(String[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println("Sum is "+sum);
    }    
}
