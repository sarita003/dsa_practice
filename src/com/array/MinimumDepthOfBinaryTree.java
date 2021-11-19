package com.array;

public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new BinaryTree.Node(1);
		tree.root.left = new BinaryTree.Node(2);
		tree.root.right = new BinaryTree.Node(3);
		tree.root.left.left = new BinaryTree.Node(4);
		tree.root.left.right = new BinaryTree.Node(5);

		System.out.println("The minimum depth of " + "binary tree is : " + tree.minimumDepthOfBinaryTree(tree.root));
	}

}

class BinaryTree {
	Node root;
	
	public int minimumDepthOfBinaryTree(Node root) {

		if (root == null)
			return 0;

		if (root.left == null && root.right == null) {
			return 1;
		}
		if (root.left == null) {
			return 1 + minimumDepthOfBinaryTree(root.right);
		}
		if (root.right == null) {
			return 1 + minimumDepthOfBinaryTree(root.left);
		}
		return Math.min(minimumDepthOfBinaryTree(root.left), minimumDepthOfBinaryTree(root.right)) + 1;
	}

	static class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}

		
	}
}