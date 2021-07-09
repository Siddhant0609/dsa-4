public class QueueUsingArray {
	
	int data[];
	int front;
	int rear;
	int size;
	
	public QueueUsingArray(int len) {
		data = new int[len];
		front = rear = -1;
		size = 0;
	}
	
	int getSize() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	int getFrontValue() {
		if(size == 0) {
			throw new RuntimeException("Queue is Empty...");
		}
		return data[front];
	}
	
	void enqueue(int element) {
		if(size == 0) {
			front = 0;
		}
		if(size == data.length) {
			throw new RuntimeException("Queue is full...");
		}
		rear++;
		size++;
		if(rear == data.length) {
			rear = 0;
		}
		data[rear] = element;
	}
	
	int dequeue() {
		if(size == 0) {
			throw new RuntimeException("Queue is Empty...");
		}
		int temp = data[front];
		front++;
		size--;
		if(size == 0) {
			front = rear = -1;
		}
		return temp;
	}
	
	void print() {
		while(!isEmpty()) {
			System.out.println(dequeue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray queue = new QueueUsingArray(4);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
//		queue.print();
		
		queue.dequeue();
		queue.dequeue();
		queue.print();

	}

}
