public class Stack {
	
	int arr[];
	int capacity;
	int top;
	
	public Stack(int capacity) {
		top = -1;
		this.capacity = capacity;
		arr = new int[capacity];
	}
	
	public void peek() {
		System.out.println(arr[top]);
	}
	
	public void push(int element) {
		if(getSize() == capacity - 1) {
			throw new RuntimeException("Stack is full...");
		}
		top++;
		arr[top] = element;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty...");
		}
		int element = arr[top];
		System.out.println("Pop : " + element);
		top--;
		return element;
	}
	
	boolean isEmpty() {
		return(top == -1);
	}
	
	int getSize() {
		return top + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
