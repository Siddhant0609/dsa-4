class X {
	int z;
	X() {
		z = 1000;
		System.out.println("X Default Const...");
	}
	X(int x) {
		this();
		z = 10;
		System.out.println("X Param const...");
	}
}
//Constructor chaining
class Y extends X {
	int z;
	int z1;
	Y() {
		super(10);
		z = 100;
		System.out.println("Y Default const...");
	}
	Y(int z) {
//		super(); // default const call
//		super(100); // explicit call
		this();
		z1 = super.z + this.z + z;
		System.out.println("Y Param const..."+z1);
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Y obj = new Y(); // default const call
		Y obj = new Y(10); // param const call
	}

}
