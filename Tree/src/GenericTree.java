import java.util.ArrayList;
import java.util.Scanner;

class Node {
	int data;
	ArrayList<Node> children;
	Node(int data) {
		this.data = data;
		children = new ArrayList<Node>();
	}
	public String toString() {
		return String.valueOf(data);
	}
}

public class GenericTree {
	Scanner scanner = new Scanner(System.in);
	public Node add() {
		System.out.println("Enter Data of a Node : ");
		int data = scanner.nextInt();
		Node parentNode = new Node(data);
		System.out.println("Enter number of children of " + data);
		int children = scanner.nextInt();
		for(int i = 1; i <= children; i++) {
			Node child = add();
			parentNode.children.add(child);
		}
		return parentNode;
	}
	
	public void print(Node root) {
		System.out.print(root.data + " => ");
//		for(int i = 1; i <= root.children.size(); i++) {
//			System.out.print(root.children.get(i) + ", ");
//		}
		
		for(Node child : root.children) {
			System.out.print(child + ", ");
		}
		
		System.out.println();	// new line
		for(Node child : root.children) {
			print(child);
		}
	}
	
	public int max(Node root) {
		if(root == null) {
			return 0;
		}
		int result = root.data;
		for(Node child : root.children) {
			int currentChildValue = max(child);
			if(currentChildValue > result) {
				result = currentChildValue;
			}
		}
		return result;
	}
	
	public int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		if(root.children.size() == 0) {
			return 1;
		}
		
		int maxDepth = 0;
		for(Node child : root.children) {
			int currentHeight = height(child);
			maxDepth = Math.max(maxDepth, currentHeight);
		}
		return maxDepth + 1;
	}
	
	public int countNodes(Node root) {
		int result = 0;
		return result;
	}
	
	public int countLeaf(Node root) {
		int leafCounter = 0;
		return leafCounter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTree obj = new GenericTree();
		Node root = obj.add();
		obj.print(root);
	}

}
