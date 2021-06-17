
public class GetOddOccurrenceXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,2,2,3,3,4,4,65,65};
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
//			System.out.println(ans);
		}
		System.out.println(ans);

	}

}
