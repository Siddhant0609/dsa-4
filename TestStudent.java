public class TestStudent {
    public static void main(String[] args) {
        // StudentData ram = new StudentData();
        StudentData ram = new StudentData(101, "Ram", "Delhi", 1200.00);
        // ram.takeInput(101, "Ram", "BCA", "Delhi", 1200.00);
        // ram.fees = 10000;
        ram.showDetails();

        System.out.println("==================================");

        StudentData shyam = new StudentData(102, "Shyam", "Delhi", 1200.00);
        // shyam.takeInput(102, "Shyam", "BCA", "Delhi", 1200.00);
        shyam.showDetails();
    }
}
