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

public class LinkedListOperations<T> {
	private Node<T> start;
	
	void InsertAtBeg(Node<T> node) {
		if(start == null) {
			start = node;
			return;
		}
		node.next = start;
		start = node;
	}
	
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
	
	void InsertAtMid(Node<T> node, int pos) {
		if(start == null) {
			start = node;
			return;
		}
		if(pos == 0) {
			node.next = start;
			start = node;
			return;
		}
		if(pos > 0) {
			int i = 1;
			Node<T> temp = start;
			while(i < pos) {
				temp = temp.next;
				i++;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}
	
	void deleteInMid(int pos) {
		Node<T> temp = null;
		if(start == null) {
			System.out.println("List is empty...");
			return;
		}
		if(pos == 0) {
			temp = start.next;
			start = temp;
			return;
		}
		temp = start;
		int i = 1;
		while(i < pos) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
	}
	
	void reverseIterate() {
		if(start == null) {
			System.out.println("List is empty...");
			return;
		}
		if(start.next == null) {
			System.out.println("List contains only one node. Can't revers");
		}
		Node<T> currentNode = start;
		Node<T> previousNode = null;
		while(currentNode != null) {
			Node<T> nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		start = previousNode;
	}
	
	Node reverseRec(Node<T> currentNode, Node<T> previousNode) {
		// Logic...
		return reverseRec(currentNode, previousNode); 
	}
	
	void midPoint() {
		Node<T> slow;
		Node<T> fast;
		if(start != null) {
			fast = slow = start;
			while(fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;	
			}
			System.out.println("Mid Point is :: " + slow.data);
		}
	}
	
	void findNthFromEnd(int n) {
		Node<T> p;
		Node<T> q;
		p = q = start;
		for(int i = 1; i <= n; i++) {
			q = q.next;
		}
		while(q != null) {
			p = p.next;
			q = q.next;
		}
		System.out.println(n + "element is " + p.data);
	}
	
	void print() {
		Node<T> temp = start;
		while(temp != null) {
			System.out.println("Node is : " + temp.data);
//			System.out.println(temp);
			temp = temp.next;
		}
		System.out.println("========================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations<Integer> operations = new LinkedListOperations<>();
		operations.InsertAtEnd(new Node<Integer>(101));
		operations.InsertAtEnd(new Node<Integer>(102));
		operations.InsertAtEnd(new Node<Integer>(103));
		operations.InsertAtEnd(new Node<Integer>(104));
		
		operations.InsertAtBeg(new Node<Integer>(105));
		
		operations.InsertAtMid(new Node<Integer>(106), 2);
		operations.InsertAtMid(new Node<Integer>(107), 4);
		operations.InsertAtMid(new Node<Integer>(108), 3);
		
		operations.print();
		
		operations.deleteInMid(0);
		operations.print();
		
		operations.deleteInMid(2);
		operations.print();
		
		operations.midPoint();
		
//		operations.reverseIterate();
//		operations.print();
		
		operations.findNthFromEnd(4);

	}

}
