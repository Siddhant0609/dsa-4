//class Node {
//	int data;
//	Node next;
//	public Node(int data) {
//		// TODO Auto-generated constructor stub
//		this.data = data;
//		this.next = null;
//	}
//}

class NodeTemp<T> {
	T data;
	NodeTemp<T> next;
	public NodeTemp(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}
	
}

public class LinkedListBasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node n1 = new Node(101);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
//		Node n2 = new Node(102);
//		n1.next = n2;
		
//		System.out.println(n1.next);
//		System.out.println(n2.next);
		
		NodeTemp<Integer> node1 = new NodeTemp<>(201);
		NodeTemp<Integer> node2 = new NodeTemp<>(202);
		node1.next = node2;
//		System.out.println(node1.next);
//		System.out.println(node2.next);
		
		// Printing the linked list
//		NodeTemp<Integer> start = node1;
//		while(start != null) {
//			System.out.println(start.data);
//			start = start.next;
//		}
		
	}

}
