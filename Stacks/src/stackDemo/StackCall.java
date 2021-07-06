package stackDemo;

public class StackCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<String> strStack = new GenericStack<String>(5);
		strStack.push("Hi");
		strStack.push("Hello");
		strStack.push("how");
		strStack.push("are");
		strStack.push("you");
		
		strStack.peek();
		
		strStack.pop();
		strStack.pop();
		strStack.pop();
		strStack.pop();
		strStack.pop();
		
//		GenericStack<Integer> intStack = new GenericStack<Integer>(5);

	}

}
