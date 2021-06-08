
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = null;
//			getNameFromDb();
			if("Ravi".equals(name)) {
				System.out.println("Welcome : "+name);
			}
			else {
				System.out.println("Welcome Guest...");
			}
//			String n = null;
//			n.toUpperCase();
//			if(n != null) {
//				n.toLowerCase();
//			}
			int arr[] = new int[10];
			arr[11] = 100;
			int x = 10 / 0;
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero...");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}
		catch(NullPointerException e) {
			System.out.println("String is null...");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some Error..Please contact with admin");
		}
	}

}
