package bmpl.linkedList;

class ListNode {
	char data;
	ListNode next;
	public ListNode(char data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
}

public class PalindromeLinkedList {
	ListNode start;
	
	void add(char data) {
		if(start == null) {
			start = new ListNode(data);
			return;
		}
		ListNode temp = start;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new ListNode(data);
	}
	
	void print() {
		ListNode temp = start;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	ListNode reverseRec(ListNode currentNode, ListNode prevNode) {
		if(currentNode == null) {
			return prevNode;
		}
		ListNode nextNode = currentNode.next;
		currentNode.next = prevNode;
		return reverseRec(nextNode, currentNode);
	}
	
	boolean palindrome() {
		ListNode prev = null;
		ListNode slow, fast;
		ListNode midNode = null;
		slow = fast = start;
//		Move to middle
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
//		For odd number of characters
		if(fast != null) {
			midNode = slow;
			slow = slow.next;
		}
		
		ListNode secondHalf = slow;
//		split the first half
		prev.next = null;
		secondHalf = reverseRec(secondHalf, null);
		boolean result = compare(start, secondHalf);
		
//		print();
		
		secondHalf = reverseRec(secondHalf, null);
		
		if(midNode != null) {
			prev.next = midNode;
			midNode.next = secondHalf;
		}
		
//		print();
		
		return result;
	}
	
	boolean compare(ListNode a, ListNode b) {
		while(a != null && b != null) {
			if(a.data == b.data) {
				a = a.next;
				b = b.next;
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeLinkedList obj = new PalindromeLinkedList();
		obj.add('r');
		obj.add('a');
		obj.add('v');
		obj.add('i');
		obj.add('x');
		obj.add('y');
		obj.add('z');
		obj.print();
		String result = obj.palindrome() ? "Palindrome" : "Not Plaindrome";
		System.out.println(result);
	}

}
