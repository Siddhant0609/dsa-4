package stackDemo;

public class NStack {
	
	int arr[];
	int top[];
	int next[];
	int capacity;
	int n;
	int free; // to store beginning index of free list
	
	public NStack(int capacity, int n) {
		this.capacity = capacity;
		this.n = n;
		arr = new int[capacity];
		next = new int[capacity];
		top = new int[n];
		
		// initialize all spaces are free
		free = 0;
		for(int i = 0; i < capacity - 1; i++) {
			next[i] = i + 1;
		}
		next[capacity - 1] = -1;
		
		// initialize all stacks are empty
		for(int i = 0; i < n; i++) {
			top[i] = -1;
		}
		
	}
	
	void push(int stackNumber, int element) {
		if(free == -1) {
			System.out.println("Stack is full...");
			return;
		}
		int index = free;
		free = next[index];
		next[index] = top[stackNumber];
		top[stackNumber] = index;
		arr[index] = element;
	}
	
	void pop(int stackNumber) {
		if(top[stackNumber] == -1) {
			System.out.println("Stack is empty...");
			return;
		}
		int index = top[stackNumber];
		int element = arr[index];
		System.out.println("Pop :: " + element );
		top[stackNumber] = next[index];
		next[index] = free;
		free = index;
	}
	
	boolean isFull() {
		return (free == -1);
	}
	
	boolean isEmpty(int sn) {
		return (top[sn] == -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NStack stack = new NStack(10, 3);
		stack.push(0, 10);
		stack.push(0, 20);
		stack.push(0, 30);
		stack.pop(0);
		stack.push(1, 1000);
		stack.push(1, 2000);
		stack.push(2, 1);
		stack.push(2, 2);
	}

}
