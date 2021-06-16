
public class RemoveAllOccurrences {
	
	static int removeAll(int arr[], int n, int val) {
		int i = 0;
		for(int j = 1; j < n; j++) {
			if(arr[j] != val) {
				arr[i] = arr[j];
				i++;
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		int n = arr.length;
		int val = 2;
		int k = removeAll(arr, n, val);
		System.out.println("K is :: " + k);

	}

}
