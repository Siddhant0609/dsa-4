
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 to n
		int arr[] = {2,1,3,4,6};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int n = arr.length;
		int total = (n + 1) * (n + 2) / 2;
		int missing = total - sum;
		System.out.println("Missing Number :: " + missing);
		
//		int arr[] = {2,1,3,4,6};
//		int arr[] = {9,10,11,13,14};
//		int x = 0;
//		int y = 0;
//		int min = 1;
//		int max = 6;
//		
//		for(int i = 0; i < arr.length; i++) {
//			x = x ^ arr[i];
////			System.out.println(x);
//		}
//		for(int i = min; i <= max; i++) {
//			y = y ^ i;
//		}
//		int missing = x ^ y;
//		System.out.println("Missing Number :: " + missing);

	}

}
