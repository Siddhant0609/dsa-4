import java.util.LinkedList;

public class TypePromotion {
	
//	void show(int x) {
//		System.out.println("Int x...");
//	}
//	void show(byte x) {
//		System.out.println("Byte x...");
//	}
//	void show(short x) {
//		System.out.println("Short x...");
//	}
//	void show(float x) {
//		System.out.println("Float x...");
//	}
//	void show(long x) {
//		System.out.println("Long x...");
//	}
//	void show(double x) {
//		System.out.println("Double x...");
//	}
//	void show(Integer x) {
//		System.out.println("Integer x...");
//	}
//	variable length arguments
	void show(int ...x) {
		System.out.println("Var args x...");
		int sum = 0;
//		enhanced for loop
		for(int i : x) {
			sum += i;
		}
		System.out.println("Sum is : "+sum);
	}
	
//	void show(int x, String ...temp ) {
//		
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion obj = new TypePromotion();
		// it will call int
		// then it will call long
		// then it will call float
		// then it will call double
		// then it will call Wrapper Integer
		obj.show(5);
		
		int x = 130; // primitive
		int xx = x;
		
//		Integer is a wrapper class
		Integer y = 100; // reference
		Integer yy = 99; // reference
		
//		System.out.println(y == yy);
		System.out.println(y.compareTo(yy));
//		compareTo -> 1,0,-1
		
		// type casting
		byte x1 = (byte)x;
		System.out.println("X1 is : "+x1);
		
		long x2 = x; // implicit type casting
		
//		Autoboxing
		Integer x3 = 100; // Boxing
		Integer x4 = x; // Boxing
		
		int y1 = x3;  // unboxing
		
//		boxing - when we convert primitive to object
//		unboxing - when we convert object to primitive
		
		Integer t = new Integer(x); // old style of boxing
		int t1 = t.intValue(); // old style of unboxing
		
//		older version of linked list
//		LinkedList l = new LinkedList();
//		l.add(t);
//		Integer i1 = (Integer)l.get(0);
//		int l2 = i1.intValue();
//		l2++;
//		l1 = new Integer(l2);
		
//		New way of using linked list
		LinkedList<Integer> l = new LinkedList<>();
		l.add(100);
		l.add(t);
		l.add(l.get(0) + 1);
		
//		to use byte and short we have to write explicit conversion
//		obj.show((byte)10);
		
//		obj.show(5L);
		obj.show();
		obj.show(5,10);
		obj.show(4,5,6,7);
		
		
		
	}

}
