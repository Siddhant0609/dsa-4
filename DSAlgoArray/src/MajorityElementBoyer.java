
public class MajorityElementBoyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,1,2,3,2,3,2,2,6};
		int majorityElement = 0;
		int count = 0;
		int n = arr.length;
		
		/*
		 * Logic :
		 * we are going to maintain a count, which is incremented whenever
		 * we see an instance of our array current element is equal to
		 * majority element and decrement whenever we see anything else
		 */
		for(int i = 0; i < n; i++) {
			if(count == 0) {
				majorityElement = arr[i];
			}
			
			if(majorityElement == arr[i]) {
				count++;
			}
			else {
				count--;
			}
		}
		
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == majorityElement) {
				count++;
			}
		}
		String msg = count > n/2 ? "Majority Element :: " +majorityElement : "No majority element";
		System.out.println(msg);
		

	}

}
