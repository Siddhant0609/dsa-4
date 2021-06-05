// S O L I D
//S - SRP
//D - DRY
//O - Open Close Principle
// Class is open for extension and close for modification

//final class Parent {
//	
//}
//
//class Child extends Parent{
//	
//}

class Parent {
	private int x;
	private void show() {
		System.out.println("Show..."+x);
	}
//	final void show() {
//		System.out.println("Show...");
//	}
}

class Child extends Parent{
//	@Override
	void show() {
		System.out.println("Show...");
	}
}


public class FinalUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.show();
		
		final double PI = 3.14;
//		PI++;
		
	}

}
