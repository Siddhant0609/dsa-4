import static java.lang.System.out;

final class MathOperations {
	private MathOperations() {}
	static void fact(int n) {
		System.out.println("Fact is...");
	}
	static void sqrt(int n) {
		System.out.println("Sqrt is...");
	}
}

public class JavaStatic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MathOperations obj = new MathOperations();
		MathOperations.fact(10);
		MathOperations.sqrt(10);
		
//		Math obj = new Math();
		out.println(Math.abs(-10));
		out.println(Math.sqrt(10));

	}

}
