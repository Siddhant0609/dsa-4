package bmpl.linkedListProblems;

class ListNode {
	
}

public class LinkedListAlternate {
	ListNode start;
	ListNode tail;
	ListNode first = null, second = null, current;
	ListNode firstTail = null, secondTail = null;
	
	void approach() {
		current = start;
		boolean alternate = true;
		while(current != null) {
			move(current, alternate);
//			current = current.next;
			alternate = !alternate;
		}
	}
	
	void move(ListNode current, boolean alternate) {
		if(alternate) {
			// work on first tail
		}
		else {
			// work on second tail
		}
	}
	
	void add() {
		
	}
	
	void print() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
