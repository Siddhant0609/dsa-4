class P {
	int x = 100;
	void show() {
		System.out.println("Parent class Show");
	}
}

class Q extends P {
	int x = 10;
	@Override
	void show() {
		System.out.println("Child class show..."+x);
	}
}

public class OverridingMethodVsVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q obj = new Q();
		P obj = new Q();
//		method binds with object
//		variables bind with class type
		obj.show();
		System.out.println("Value of x is : " + obj.x);

	}

}
