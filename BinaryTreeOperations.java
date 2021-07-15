import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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
	
	public void rightViewIter(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				BinaryTree<Integer> currentNode =  queue.removeFirst();
				if(i == size - 1) {
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
	
	// DFT
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
	
	class Pair<T> {
		BinaryTree<T> node;
		int level;
		Pair(BinaryTree<T> node, int level) {
			this.node = node;
			this.level = level;
		}
	}
	
	// BFT
	public void verticalOrderIter(BinaryTree<Integer> root) {
		LinkedList<Pair<Integer>> queue = new LinkedList<BinaryTreeOperations.Pair<Integer>>();
		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		queue.add(new Pair<Integer>(root, 0));
		int minDistance = 0, maxDistance = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size > 0) {
				Pair<Integer> pair = queue.removeFirst();
				minDistance = Math.min(minDistance, pair.level);
				maxDistance = Math.max(maxDistance, pair.level);
				// If map key is not present, so create a new array list object and add it to map
//				if(map.get(pair.level) == null) {
//					List<Integer> list = new ArrayList<Integer>();
//					list.add(pair.node.data);
//					map.put(pair.level, list);
//				}
//				else {
//					List<Integer> list = map.get(pair.level);
//					list.add(pair.node.data);
//					map.put(pair.level, list);
//				}
				
				map.putIfAbsent(pair.level, new ArrayList<Integer>());
				map.get(pair.level).add(pair.node.data);
				
				if(pair.node.left != null) {
					queue.add(new Pair<Integer>(pair.node.left, pair.level-1));
				}
				else if(pair.node.right != null) {
					queue.add(new Pair<Integer>(pair.node.right, pair.level+1));
				}
				size--;
			}
		}
		for(int i = minDistance; i<= maxDistance; i++) {
			System.out.println(i + " " + map.get(i));
		}
	}
	
	public void topView(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		int distance = 0;
		getVerticalOrder(root, distance, map);
		for(Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue().get(0));
		}
	}
	
	public void bottomView(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		int distance = 0;
		getVerticalOrder(root, distance, map);
		for(Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue().get(m.getValue().size() - 1));
		}
	}
	
	public void diagonalTraversal(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<BinaryTree>();
		queue.addLast(root);
		while(queue.size() != 0) {
			int size = queue.size();
			ArrayList<Integer> smallResults = new ArrayList<Integer>();
			while(size-- > 0) {
				// traverse each component of that particular diagonal
				BinaryTree<Integer> currentNode = queue.removeFirst();
				while(currentNode != null) {
					System.out.println(currentNode.data + ", ");
					smallResults.add(currentNode.data);
					if(currentNode.left != null) {
						queue.addLast(currentNode.left);
					}
					currentNode = currentNode.right;
				}
				System.out.println();
			}
		}
	}
	
	private void printLeaf(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		printLeaf(root.left);
		if(root.left == null && root.right == null) {
			System.out.print(root.data + ", ");
		}
		printLeaf(root.right);
	}
	
	private void printLeftBoundary(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		if(root.left != null) {
			System.out.print(root.data);
			printRightBoundary(root.left);
		}
		else if(root.right != null) {
			System.out.print(root.data);
			printRightBoundary(root.right);
		}
	}
	
	private void printRightBoundary(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		if(root.right != null) {
			printRightBoundary(root.right);
			System.out.print(root.data);
		}
		else if(root.left != null) {
			printRightBoundary(root.left);
			System.out.print(root.data);
		}
	}
	
	public void printBoundary(BinaryTree<Integer> root) {
		printLeftBoundary(root.left);
		System.out.println();
		printLeaf(root);
		System.out.println();
		printRightBoundary(root.right);
	}
	
	boolean isChildSum(BinaryTree<Integer> root) {
		if(root == null) {
			return true;
		}
		if(root.left == null && root.right == null) {
			return true;
		}
		int sum = 0;
		if(root.left != null) {
			sum += root.left.data;
		}
		if(root.right != null) {
			sum += root.right.data;
		}
		return (root.data == sum && isChildSum(root.left ) && isChildSum(root.right));
	}
	
	int isBalancedTree(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftH = isBalancedTree(root.left);
		if(leftH == -1) {
			return -1;
		}
		int rightH = isBalancedTree(root.right);
		if(rightH == -1) {
			return -1;
		}
		if(Math.abs(rightH - leftH) > 1) {
			return -1;
		}
		else {
			return Math.max(leftH, rightH) + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperations obj = new BinaryTreeOperations();
		BinaryTree<Integer> root = obj.insert();
//		obj.print(root);
//		obj.levelOrder(root);
		System.out.println("Level Order");
		obj.levelOrderPrintBetter(root);
		System.out.println("====================");
		System.out.println("Left View");
//		obj.leftView(root, 1);
		obj.leftViewIter(root);
		System.out.println("====================");
		System.out.println("Vertical Order");
		obj.printVerticalOrder(root);
		System.out.println("====================");
		System.out.println("Top View");
		obj.topView(root);
		System.out.println("====================");
		System.out.println("Diagonal Traversal View");
		obj.diagonalTraversal(root);
		System.out.println("====================");
		System.out.println("Boundary Traversal");
		obj.printBoundary(root);
		System.out.println("====================");
		System.out.println("Balanced Tree");
		int result = obj.isBalancedTree(root);
		System.out.println(result);
	}

}
