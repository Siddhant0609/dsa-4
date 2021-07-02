package bmpl.linkedList;

class Node<T> {
	T data;
	Node<T> next;
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	public String toString() {
		return "Node : " + data + " Pointer : " + next;
	}
}

public class LinkedListProblems<T> {
	private Node<T> start;
	
	void InsertAtEnd(Node<T> node) {
		if(start == null) {
			start = node;
			return;
		}
		Node<T> current = start;
		while(current.next != null) {
			current = current.next;
		}
		current.next = node;
	}
	
	int getSize() {
		Node<T> temp = start;
		int size = 0;
		while(temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
	Node<T> getAt(int index) {
		int size = getSize();
		if(size == 0) {
			System.out.println("LinkedList is Blank...");
		}
		if(index < 0 || index >= size) {
			System.out.println("Invalid Index...");
		}
		Node<T> temp = start;
		for(int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	void reverseData() {
		int left = 0;
		int right = getSize() - 1;
		while(left < right) {
			Node<T> leftNode = getAt(left);
			Node<T> rightNode = getAt(right);
			T temp = leftNode.data;
			leftNode.data = rightNode.data;
			rightNode.data = temp;
			left++;
			right--;
		}
	}
	
	void print() {
		Node<T> temp = start;
		while(temp != null) {
			System.out.println("Node is : " + temp.data);
			System.out.println("Node is : " + temp.next);
//			System.out.println(temp);
			temp = temp.next;
		}
		System.out.println("========================");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListProblems<Integer> operations = new LinkedListProblems<>();
		operations.InsertAtEnd(new Node<Integer>(101));
		operations.InsertAtEnd(new Node<Integer>(102));
		operations.InsertAtEnd(new Node<Integer>(103));
		operations.InsertAtEnd(new Node<Integer>(104));
		
		System.out.println("Before Data Reverse");
		operations.print();
		
		System.out.println("After Data Reverse");
		operations.reverseData();
		operations.print();

	}

}
