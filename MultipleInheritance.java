interface I1 {
	int x = 10;
	void show();
	void print();
}

interface I2 {
	int x = 20;
	void show();
}

interface I3 extends I1, I2 {
	
}

class H1 implements I3 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("X1 is : " + I1.x);
		System.out.println("X2 is : " + I2.x);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

//class H2 {
//	void show() {
//		System.out.println("Show H2 Parent...");
//	}
//}



public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
