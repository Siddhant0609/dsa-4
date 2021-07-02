package bmpl.linkedList;

class Node2 {
	int data;
	Node2 next;
	public Node2(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListIntersection {
	private Node2 head1;
	private Node2 head2;
	
	int getCount(Node2 node) {
		Node2 current = node;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	int getNode() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;
		if(c1 > c2) {
			d = c1 - c2;
			return getIntersection(d, head1, head2);
		}
		else {
			d = c2 - c1;
			return getIntersection(d, head2, head1);
		}
	}
	
	int getIntersection(int d, Node2 node1, Node2 node2) {
		int i;
		Node2 current1 = node1;
		Node2 current2 = node2;
		for(i = 0; i < d; i++) {
			if(current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while(current1 != null && current2 != null) {
			if(current1.data == current2.data) {
				return current1.data;
			}
			current1 = current2;
			current2 = current2.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
