import java.util.Arrays;

public class PairDifference {
	
	static void pairDiff(int arr[]) {
		int n = arr.length;
		int k = 2;
		int diff = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				diff = arr[j] - arr[i];
				if(diff == k) {
					System.out.println("Pair is :: " + arr[i] + "," + arr[j]);
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,5,6,3,8};
		pairDiff(arr);

	}

}
