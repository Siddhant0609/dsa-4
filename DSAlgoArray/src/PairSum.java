
public class PairSum {
	
//	static void pairSumA1(int arr[]) {
//		int n = arr.length;
//		int k = 10;
//		int sum = 0;
//		for(int i = 0; i < n; i++) {
//			for(int j = i + 1; j < n; j++) {
//				sum = arr[i] + arr[j];
//				if(sum == k) {
//					System.out.println("Pair is :: " + arr[i] + "," + arr[j]);
//					return;
//				}
//			}
//		}
//	}
	
	static void pairSumA1(int arr[]) {
		int n = arr.length;
		int k = 10;
		int hash[] = new int[10]; 
		for(int i = 0; i < n; i++) {
			int index = k - arr[i];
//			System.out.print(index+",");
			for(int a : hash) {
				System.out.print(a+",");
			}
			System.out.println("-----------------------");
			if(hash[index] == 1) {
				System.out.println("Pair is :: " + arr[i] + "," + index);
				break;
			}
			hash[arr[i]] = 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,5,6,3,8};
		pairSumA1(arr);

	}

}
