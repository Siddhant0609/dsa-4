class Customer {
	static int counter; // class variable
//	int counter; // instance variables
	int id; // instance variables
	String name;
	double balance;
	
	static {
		counter = 100;
		System.out.println("Static block executed...");
	}
	
	public Customer(String name, double balance) {
		// TODO Auto-generated constructor stub
//		this.id = id;
		counter++;
		this.id = counter;
		this.name = name;
		this.balance = balance;
		System.out.println("Object Created...");
	}
}

public class JavaStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ram = new Customer("Ram", 45000.00);
		System.out.println("Ram ID : " + ram.id);
		
		Customer shyam = new Customer("Shyam", 45000.00);
		System.out.println("Shyam ID : " + shyam.id);
		
		System.out.println("Ram ID : " + ram.id);
		
		Customer mohan = new Customer("Mohan", 45000.00);
		System.out.println("Mohan ID : " + mohan.id);
		
		System.out.println("Ram ID : " + ram.id);
		
		
	}

}
