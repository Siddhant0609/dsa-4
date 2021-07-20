public class OddApprearence {
	
	static void oddOccurrence(int arr[], int n) {
		int xor = 0;
		int result1 = 0, result2 = 0;
		for(int i = 0; i < n; i++) {
			xor = xor ^ arr[i];
		}
//		System.out.println(xor);
		int x = xor & (~(xor - 1));
//		System.out.println(x);
		for(int i = 0; i < n; i++) {
			if((arr[i] & x) != 0 ) {
				result1 = result1 ^ arr[i];
			}
			else {
				result2 = result2 ^ arr[i];
			}
		}
		System.out.println(result1 + ", " + result2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,5,4,3,7,8,7,8};
		int n = arr.length;
		oddOccurrence(arr, n);
	}

}
