
public class RemoveDuplicateFromSorted {
	
	static int removeDuplicate(int arr[], int n) {
		int i = 0;
		for(int j = 1; j < n; j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		int n = arr.length;
		int k = removeDuplicate(arr, n);
		System.out.println("K is :: " + k);

	}

}
