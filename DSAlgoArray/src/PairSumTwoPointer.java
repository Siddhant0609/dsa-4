
public class PairSumTwoPointer {

	static void pairSum(int arr[]) {
		int k = 9;
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if(arr[i] + arr[j] == k) {
				System.out.println("Pair is :: " + arr[i] + "," + arr[j]);
				return;
			}
			else if ((arr[i] + arr[j]) < k) {
				i++;
			}
			else if ((arr[i] + arr[j]) > k) {
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,5,6,3,8};
		pairSum(arr);
	}

}
