interface K1 {
	void show();
//	void showMeAlso();

	//	now it's not abstract anymore
	default void print() {
		System.out.println("K1 Interface Call...");
	}
}

interface K2 {
	default void print() {
		System.out.println("K2 Interface call...");
	}
}

interface K3 extends K1, K2 {

	@Override
	default void print() {
		// TODO Auto-generated method stub
//		K1.super.show();
		K1.super.print();
		K2.super.print();
		System.out.println("K3 Interface print...");
	}
	
}

class KK implements K3 {
	public void show() {
		System.out.println("KK Class show...");
	}

//	@Override
//	public void print() {
//		K1.super.print();
//	}
}


public class JavaDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KK obj = new KK();
		obj.show();
		obj.print();
	}

}
