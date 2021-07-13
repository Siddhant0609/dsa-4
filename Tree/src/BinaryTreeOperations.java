import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

class BinaryTree<T> {
	T data;
	BinaryTree<T> left;
	BinaryTree<T> right;
	BinaryTree(T data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTreeOperations {
	Scanner scanner = new Scanner(System.in);
	String msg = "root";
	static int maxLevel = 0;
	
	BinaryTree<Integer> insert() {
		System.out.println("Enter the " + msg + " data or enter -1 to exit");
		int data = scanner.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTree<Integer> node = new BinaryTree<>(data);
		msg = "left";
		node.left = insert();
		msg = "right";
		node.right = insert();
		msg = "root";
		return node;
	}
	
	void print(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		String output = "";
		if(root.left != null) {
			output += "L : " + root.left.data + ", ";
		}
		if(root.right != null) {
			output += "R : " + root.right.data + ", ";			
		}
		System.out.println(output);
		print(root.left);
		print(root.right);
	}
	
	public void preOrder(BinaryTree<Integer> root) {
		// Root, Left, Right
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void preOrderIter(BinaryTree<Integer> root) {
		Stack<BinaryTree> stack = new Stack<BinaryTree>();
		stack.push(root);
		while(!stack.isEmpty()) {
			BinaryTree<Integer> currentNode = stack.pop();
			System.out.println(currentNode.data);
			if(currentNode.right != null) {
				stack.push(currentNode.right);
			}
			if(currentNode.left != null) {
				stack.push(currentNode.left);
			}
		}
	}
	
	public void preOrderIter2(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		Stack<BinaryTree> stack = new Stack<BinaryTree>();
		BinaryTree<Integer> currentNode = root;
		while(currentNode != null || !stack.isEmpty()) {
			while(currentNode != null) {
				System.out.println(currentNode.data);
				if(currentNode.right != null) {
					stack.push(currentNode.right);
				}
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
		}
	}
	
	public void inOrder(BinaryTree<Integer> root) {
		// Left, Root, Right
		if(root == null) {
			return;
		}
		preOrder(root.left);
		System.out.println(root.data);
		preOrder(root.right);
	}
	
	public void inOrderIter(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		Stack<BinaryTree> stack = new Stack<BinaryTree>();
		BinaryTree<Integer> currentNode = root;
		while(currentNode != null || !stack.isEmpty()) {
			while(currentNode != null) {
//				System.out.println(currentNode.data);
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			System.out.println(currentNode.data);
			currentNode = currentNode.right;
		}
	}
	
	public void postOrder(BinaryTree<Integer> root) {
		// Left, Right, Root
		if(root == null) {
			return;
		}
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data);
	}
	
	void levelOrder(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTree<Integer> currentNode =  queue.removeFirst();
			System.out.println(currentNode.data);
			if(currentNode.left != null) {
				queue.addLast(currentNode.left);
			}
			if(currentNode.right != null) {
				queue.addLast(currentNode.right);
			}
			
		}
	}
	
	void levelOrderPrintBetter(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				BinaryTree<Integer> currentNode =  queue.removeFirst();
				System.out.print(currentNode.data + ", ");
				if(currentNode.left != null) {
					queue.addLast(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.addLast(currentNode.right);
				}
			}
			System.out.println();
		}
	}
	
	public void leftView(BinaryTree<Integer> root, int level) {
		if(root == null) {
			return;
		}
		if(maxLevel < level) {
			System.out.println(root.data);
			maxLevel = level;
		}
		leftView(root.left, level + 1);
		leftView(root.right, level + 1);	
	}
	
	public void leftViewIter(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				BinaryTree<Integer> currentNode =  queue.removeFirst();
				if(i == 0) {
					System.out.print(currentNode.data);
				}
				if(currentNode.left != null) {
					queue.addLast(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.addLast(currentNode.right);
				}
			}
			System.out.println();
		}
	}
	
	public void rightView(BinaryTree<Integer> root, int level) {
		if(root == null) {
			return;
		}
		if(maxLevel < level) {
			System.out.println(root.data);
			maxLevel = level;
		}
		leftView(root.right, level + 1);
		leftView(root.left, level + 1);
	}
	
	public void rightViewIter() {
		
	}
	
	public void printVerticalOrder(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		int distance = 0;
		getVerticalOrder(root, distance, map);
		for(Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
	
	public void getVerticalOrder(BinaryTree<Integer> root, int distance, TreeMap<Integer, ArrayList<Integer>> map) {
		if(root == null) {
			return;
		}
		if(map.get(distance) == null) {
			ArrayList<Integer> I = new ArrayList<Integer>();
			I.add(root.data);
			map.put(distance, I);
		}
		else {
			ArrayList<Integer> I = map.get(distance);
			I.add(root.data);
			map.put(distance, I);
		}
		getVerticalOrder(root.left, distance - 1, map);
		getVerticalOrder(root.right, distance + 1, map);
	}
	
	public void topView(BinaryTree<Integer> root) {
		
		class QueueObj {
			BinaryTree<Integer> node;
			int distance;
			public QueueObj(BinaryTree<Integer> node, int distance) {
				this.node = node;
				this.distance = distance;
			}
		}
		
		Queue<QueueObj> q = new LinkedList<QueueObj>();
		Map<Integer, BinaryTree> topViewMap = new TreeMap<Integer, BinaryTree>();
		if(root == null) {
			return;
		}
		else {
			q.add(new QueueObj(root, 0));
		}
		
		System.out.println("Top View :: ");
		while(!q.isEmpty()) {
			QueueObj tmpNode = q.poll();
			if(!topViewMap.containsKey(tmpNode.distance)) {
				topViewMap.put(tmpNode.distance, tmpNode.node);
			}
			
			if(tmpNode.node.left != null) {
				q.add(new QueueObj(tmpNode.node.left, tmpNode.distance - 1));
			}
			
			if(tmpNode.node.right != null) {
				q.add(new QueueObj(tmpNode.node.right, tmpNode.distance + 1));
			}
		}
		
		for(Entry<Integer, BinaryTree> entry : topViewMap.entrySet()) {
			System.out.println(entry.getValue().data);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperations obj = new BinaryTreeOperations();
		BinaryTree<Integer> root = obj.insert();
//		obj.print(root);
//		obj.levelOrder(root);
		obj.levelOrderPrintBetter(root);
		System.out.println("====================");
//		obj.leftView(root, 1);
		obj.leftViewIter(root);
		System.out.println("====================");
		obj.printVerticalOrder(root);
	}

}
