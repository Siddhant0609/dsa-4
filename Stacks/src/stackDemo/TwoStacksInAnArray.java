package stackDemo;


public class TwoStacksInAnArray {
	int arr[];
	int capacity;
	int top1, top2;
	
	public TwoStacksInAnArray(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		top1 = -1;
		top2 = capacity;
	}
	
	void push1(int element) {
		if(top1 < top2 - 1) {
			top1++;
			arr[top1] = element;
		}
	}
	
	void push2(int element) {
		if(top1 < top2 - 1) {
			top2--;
			arr[top2] = element;
		}
	}
	
	int pop1() {
		if(top1 >= 0) {
			int element = arr[top1];
			top1--;
			return element;
		}
		else {
			throw new RuntimeException("Stack 1 is empty...");
		}
	}
	
	int pop2() {
		if(top2 >= capacity) {
			int element = arr[top1];
			top2++;
			return element;
		}
		else {
			throw new RuntimeException("Stack 2 is empty...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
