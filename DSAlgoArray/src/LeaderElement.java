
public class LeaderElement {
	
	static void leader(int arr[]) {
		int n = arr.length;
		int max = 0;
		for(int i = n -1; i >= 0; i--) {
			if(arr[i] > max) {
				System.out.println("Leader :: " + arr[i]);
				max = arr[i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,8,12,9,10,8,1};
		leader(arr);

	}

}
