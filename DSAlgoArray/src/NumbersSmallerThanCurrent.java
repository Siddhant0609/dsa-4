
public class NumbersSmallerThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8,1,2,2,3};
		int count = 0;
		int index = 0;
		int n = arr.length;
		int output[] = new int[n];
		for(int i = 0; i < n; i++, index++) {
			count = 0;
			for(int j = 0; j < n; j++) {
				if(arr[i] > arr[j]) {
					count++;
				}
			}
			output[index] = count;
		}
		System.out.println("Output....");
		for(int i : output) {
			System.out.print(i + ",");
		}

	}

}
