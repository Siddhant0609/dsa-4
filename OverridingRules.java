class Xyz {
	int a,b,c;
}

class XPlus extends Xyz {
	int d,e;
}

class Parent1 {
	protected void show() {
		System.out.println("Parent_1 show...");
	}
	protected Xyz showMe() {
		Xyz obj = new Xyz();
		return obj;
	}
}

class Child1 extends Parent1{
	@Override
	public void show() {
		System.out.println("Child_1 show...");
	}
	
	@Override
	public XPlus showMe() {
		XPlus obj = new XPlus();
		return obj;
	}
}

public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
