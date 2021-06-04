
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101, "Ram", "Delhi", 1200.00);
        // ram.takeInput(101, "Ram", "BCA", "Delhi", 1200.00);
        // ram.fees = 10000;
        int fine = 1000;
        ram.setFees(ram.getFees() + fine);
        String details = ram.showDetails();
        System.out.println(details);

        System.out.println("==================================");

//        Student shyam = new Student(102, "Shyam", "Delhi", 1200.00);
        // shyam.takeInput(102, "Shyam", "BCA", "Delhi", 1200.00);
//        shyam.showDetails();
	}

}
