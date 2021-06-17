import java.util.Arrays;
import java.util.HashMap;

public class NumberSmallerThanCurrentHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,1,2,2,3};
		int clone[] = arr.clone();	// clone array
		int n = arr.length;
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			map.put(arr[i], i);
		}
		int output[] = new int[n];
		for(int i = 0; i < n; i++) {
			output[i] = map.get(clone[i]);
		}
		for(int i : output) {
			System.out.print(i + ",");
		}
	}

}
