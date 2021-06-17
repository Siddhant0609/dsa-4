
public class MaximixeExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int p = 1, q = 2, r = 3;
		// Calculating prefix max
		int pmax[] = new int[n];
		pmax[0] = arr[0];
		for(int i = 1; i < arr.length; i++) {
			pmax[i] = Math.max(pmax[i - 1], arr[i]);
		}
		
//		System.out.println("Prefix Max ::");
//		for(int i : pmax) {
//			System.out.println(i);
//		}
		
		int ans = Integer.MIN_VALUE;
		for(int i = 1; i < n - 1; i++) {
			int expression = p * pmax[i - 1] + q * arr[i] + r * pmax[i + 1];
			ans = Math.max(ans, expression);
			System.out.println(pmax[i - 1] + "," + arr[i] + "," + pmax[i + 1]);
		}
		System.out.println(ans);

	}

}
