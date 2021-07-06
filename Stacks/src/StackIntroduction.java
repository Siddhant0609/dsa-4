//import java.util.Stack;

public class StackIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Default Stack provided by Java
//		Stack<String> stack = new Stack<String>(5);
//		stack.push("hi");
//		stack.push("how");
//		stack.push("are");
//		stack.push("you");
		
		// Stack build by us
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.peek();	// return top element
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}

}
