class BST {
	int data;
	BST left;
	BST right;
	BST(int data) {
		this.data = data;
	}
}

public class BinarySearchTree {
	BST root;
	
	/*
	 * Insertion
	 * Check root exists or not
	 * If root not exists so make root node
	 * If root present then compare new node data < or >, based on comparison call either
	 * left recursive call or right recursive call
	 */
//	void insert(int data) {
//		root = insert(root, data);
//	}
	
	BST insert(BST root, int data) {
		if(this.root == null) {
			this.root = new BST(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insert(root.left, data);
		}
		else if(data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}
	
	void inorder(BST root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	void print() {
		inorder(root);
	}
	
	BST search(BST root, int data) {
		if(root == null || root.data == data) {
			return root;
		}
		
		// val is greater than root's data
		if(root.data > data) {
			return search(root.left, data);
		}
		
		// val is less than root's data
		return search(root.right, data);
	}
	
	// Minimum element in BST
	int minValue(BST root) {
		int minv = root.data;
		while(root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
	
	// Maximum element in BST
		int maxValue(BST root) {
			int maxv = root.data;
			while(root.right != null) {
				maxv = root.right.data;
				root = root.right;
			}
			return maxv;
		}
		
		void addNode(BST root, int data) {
			if(data > root.data) {
				if(root.right == null) {
					BST node = new BST(data);
					node.data = data;
					root.right = node;
				}
				else {
					addNode(root.right, data);
				}
			}
			else {
				if(root.left == null) {
					BST node = new BST(data);
					node.data = data;
					root.left = node;
				}
				else {
					addNode(root.left, data);
				}
			}
		}
		
		void remove(BST currentNode, BST parentOfCurrent, boolean isLeft, int data) {
			if(data > currentNode.data) {
				remove(currentNode.right, currentNode, false, data);
			}
			else if(data < currentNode.data) {
				remove(currentNode.left, currentNode, true, data);
			}
			else {
				/*
				 * 4 cases when we delete a node
				 * Case 1 : left child and right child both are null
				 * Case 2 : left is null, but right child is available
				 * Case 3 : left is not null, but right child is null
				 * Case 4 : left child and right child both are not null
				 */
				
//				Case 1
				if(currentNode.left == null && currentNode.right == null) {
					if(isLeft) {
						parentOfCurrent.left = null;
					}
					else {
						parentOfCurrent.right = null;
					}
				}
				
//				Case 2
				if(currentNode.left == null && currentNode.right != null) {
					if(isLeft) {
						parentOfCurrent.left = currentNode.right;
					}
					else {
						parentOfCurrent.right = currentNode.right;
					}
				}
				
//				Case 3
				if(currentNode.left != null && currentNode.right == null) {
					if(isLeft) {
						parentOfCurrent.left = currentNode.left;
					}
					else {
						parentOfCurrent.right = currentNode.left;
					}
				}
				
//				Case 4
				if(currentNode.left != null && currentNode.right != null) {
					int max = this.maxValue(currentNode.left);
					System.out.println("Left max is :: " + max);
					currentNode.data = max;
					remove(currentNode.left, currentNode, true, max);
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
