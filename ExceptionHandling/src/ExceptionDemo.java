import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int num_1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			int num_2 = scanner.nextInt();
			int add = num_1 + num_2;
			System.out.println("Sum is : " + add);
			int sub = num_1 - num_2;
			System.out.println("Sub is : " + sub);
			double div = num_1 / num_2;
			System.out.println("Div is : " + div);
			int mul = num_1 * num_2;
			System.out.println("Mul is : " + mul);
		}
		catch (ArithmeticException e) {
			System.err.println("Cannot Divide by Zero...");
		}
		catch(InputMismatchException e) {
			System.err.println("Invalid Input...");
		}
		
	}

}
