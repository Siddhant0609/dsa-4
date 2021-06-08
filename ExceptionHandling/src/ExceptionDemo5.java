import java.util.Scanner;

public class ExceptionDemo5 {
	
	static void atm() {
		int total_bal = 10000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your PIN : ");
		try {
			int pin = scanner.nextInt();
			if(pin == 1234) {
				System.out.println("Welcome User");
			}
			else {
				System.out.println("Invalid PIN");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid User...");
		}
		System.out.println("Enter the amount : ");
		int amount = scanner.nextInt();
		total_bal -= amount;
		System.out.println("Transaction Successfull...");
		System.out.println("Remaining Balance is : "+total_bal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atm();
	}

}
