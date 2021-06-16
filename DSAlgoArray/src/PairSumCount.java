import java.util.Arrays;

public class PairSumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,4,3,3,5,5,5,6,6,7,7,7,11};
		int k = 10;
		int n = arr.length;
		Arrays.sort(arr);
		int i = 0;
		int j = n - 1;
		while(i < j) {
			if((arr[i] + arr[j]) == k) {
				int ans = 0;
				if(arr[i] == arr[j]) {
					int len = j - i + 1;
					ans += len * (len - 1) / 2;
//					break;
				}
				int v1 = arr[i];	// store ith pointer value
				int v2 = arr[j];	// store jth pointer value
				int c1 = 0;
				int c2 = 0;
				while (arr[i] == v1) {
					i++; c1++;
				}
				while(arr[j] == v2) {
					j--; c2++;
				}
				ans = ans + (c1 * c2);	// product of both count to get the combination
//				System.out.println("Pair is :: " + arr[i] + "," + arr[j]);
				System.out.println("Pair is :: " + v1 + "," + v2);
				System.out.println("Frequence is :: " + c1);
				System.out.println("Ans :: " + ans);
			}
			else if((arr[i] + arr[j]) < k) {
					i++;
			}
			else if((arr[i] + arr[j]) > k ) {
					j--;
			}
		}
	}

}
