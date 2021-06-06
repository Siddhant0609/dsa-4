interface Calc {
	int compute(int x, int y);
}

class MyCalc implements Calc {
	@Override
	public int compute(int x, int y) {
		return x + y;
	}
}

public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyCalc calc = new MyCalc();
//		int result = calc.compute(3, 6);
//		System.out.println("Result is : " + result);
		
//		the name of class is anonymous
//		Calc calc = new Calc() {
//			public int compute(int x, int y) {
//				return x + y;
//			}
//		};
//		System.out.println(calc.compute(4, 6));
		
//		Calc calc_2 = new Calc() {
//			public int compute(int x, int y) {
//				return x + y;
//			}
//		};
//		System.out.println(calc_2.compute(4, 6));
		
//		Lambda expression - java 8 onwards
		Calc c = (a,b)-> a + b;
		System.out.println(c.compute(5, 6));
//		sam - single abstract method
		
		Calc c1 = (a,b) -> {
			int d = a * b;
//			System.out.println("Result is : " + d);
			return d;
		};
		System.out.println(c1.compute(5, 6));

	}

}
