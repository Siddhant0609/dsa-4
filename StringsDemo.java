
public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ravi".intern();
		String name2 = "Ravi";
		System.out.println(name == name2);
		
//		String name3 = new String("Ravi");
//		String name4 = new String("Ravi");
//		System.out.println(name3 == name4);
		
		String name3 = new String("Ravi");
		System.out.println(name == name3);
		
//		Strings are immutable
		String t = "hello";
		String y = t;
		System.out.println(y == t);
		t = "hi";
		System.out.println(y == t);
		
//		StringBuffer - by default it will create 16 size of array
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity() + " : " + sb.length());
		sb.append("hello world");
		System.out.println(sb.capacity() + " : " + sb.length());
		sb.append("how are you ?");
		System.out.println(sb.capacity() + " : " + sb.length());
//		formula = old_Capacity * 2 + 2
//		+2 -  null character
		sb.append("I am fine,thankyou for asking...");
		System.out.println(sb.capacity() + " : " + sb.length());
		
		sb.append("I am fineskdadlkajdlksadklsajdlksadlksajdlkjsalkdjsakldjsalkdjlsakjdklasjdlkasjdlksajdlksajlkdja.");
		System.out.println(sb.capacity() + " : " + sb.length());
		
		sb.append("I am fine");
		System.out.println(sb.capacity() + " : " + sb.length());
		
		System.out.println("=================================");
		
//		StringBuffer sb2 = new StringBuffer(200);
		StringBuilder sb2 = new StringBuilder(200);
		System.out.println(sb2.capacity() + " : " + sb2.length());
		
		sb2.append("I am fine");
		System.out.println(sb2.capacity() + " : " + sb2.length());
		
		// always ensure capacity will be greater
		sb2.ensureCapacity(250);
		sb2.append("I am fine");
		System.out.println(sb2.capacity() + " : " + sb2.length());
		
		
//		StringBuilder
//		StringBuilder sbuild = new StringBuilder();
//		sbuild.append("I am fine");
//		System.out.println(sbuild.capacity() + " : " + sbuild.length());
//		
	}

}




