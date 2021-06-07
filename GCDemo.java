class GCCode {
	int x,y;
	public GCCode(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		System.out.println("Object Created...");
	}
	@Override
	protected void finalize() {
		System.out.println("Object Destroyed...");
	}
}

public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCCode obj = new GCCode(4, 6);
		obj = null;	// first way
		
		GCCode obj2 = new GCCode(4, 6);
		GCCode obj3 = new GCCode(4, 6);
//		2nd way
		obj3 = obj2;
		
//		3rd way
		if (5 > 4) {
			GCCode obj4 = new GCCode(4, 6);
		}
		
		System.gc();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}

}
