public class CircularQueue {
	
	private int array[];
	private int rear;
	private int front;
	private final int DEFAULT_CAPACITY = 10;
	
	public CircularQueue() {
		array = new int[DEFAULT_CAPACITY];
		rear = front = 0;
	}
	
	public CircularQueue(int capacity) {
		if(capacity < 1) {
			throw new RuntimeException("Invalid Capacity...");	
		}
		array = new int[capacity];
		front = rear = 0;
	}
	
	int getSize() {
		return rear;
	}
	
	boolean isEmpty() {
		return rear == 0;
	}
	
	void enqueue(int data) {
		if(rear == array.length) {
			throw new RuntimeException("Queue is Full...");
		}
		int availableIndex = (front + rear) % array.length;
		array[availableIndex] = data;
		rear++;
	}
	
	public int dequeue() {
		if(rear == 0) {
			throw new RuntimeException("Queue is Empty...");
		}
		int value = array[front];
		array[front] = 0;
		front = (front + 1) % array.length;
		rear--;
		return value;
	}
	
	public void print() {
		for(int i = 0; i < rear; i++) {
			int availIndex = (front + i) % array.length;
			System.out.println(array[availIndex]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue cq = new CircularQueue(6);
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);
		cq.enqueue(60);
//		cq.print();
		cq.dequeue();
		cq.dequeue();
		cq.enqueue(80);

	}

}
