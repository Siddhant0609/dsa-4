import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {
	
	static void dao() throws InputMismatchException, ArithmeticException {
		System.out.println("Connection Open...");
		
//		try {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter first number : ");
//			int num_1 = scanner.nextInt();
//			System.out.println("Enter second number : ");
//			int num_2 = scanner.nextInt();
//			int div = num_1 / num_2;
//			System.out.println("Div is : " + div);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Cannot divide by zero...");
//		}
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int num_1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			int num_2 = scanner.nextInt();
			int div = num_1 / num_2;
			System.out.println("Div is : " + div);
			
			System.out.println("Querying Data...");
			System.out.println("Sending results to helper...");
		}
		finally {
			System.out.println("Connection Close...");
		}
	}
	
	static void helper() throws InputMismatchException, ArithmeticException {
		System.out.println("Calling DAO..");
		dao();
		System.out.println("Getting results from DAO");
		System.out.println("Sending results to view...");
	}
	
	static void view() {
		try {
			helper();
			System.out.println("Calling Helper...");
			System.out.println("Getting results from Helper...");
			System.out.println("Show results...");
		}
		catch (InputMismatchException e) {
			System.err.println("Invalid Input...");
			e.printStackTrace(); // for developers
		}
		catch(ArithmeticException e) {
			System.err.println("Division by Zero...");
			e.printStackTrace(); // for developers
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view();
	}

}
