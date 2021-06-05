class GrandFather {
	int x = 10;
}
class Father extends GrandFather {
	int x = 100;
}

class Son extends Father {
	int x = 200;
	Son(int x) {
		int z = ((GrandFather)this).x + super.x + this.x + x;
//		int z = ((Father)this).x + this.x;
		System.out.println(z);
	}
}

public class MultilevelHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj = new Son(10);

	}

}
