package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BinaryTree {
	private TreeNode root;

	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);

		root = first;
		first.left = second;
		first.right = third;

		second.left = fourth;
		second.right = fifth;
	}

	public void recursivePreoder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		recursivePreoder(root.left);
		recursivePreoder(root.right);
	}
	
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	public void postOrder (TreeNode root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	public void levelOrder() {
		if(root==null) {
			return;
		}
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			TreeNode temp=queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left!=null) {
				queue.offer(temp.left);
			}
			if(temp.right!=null) {
				queue.offer(temp.right);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		System.out.println("PreOrder Traversal");
		bt.recursivePreoder(bt.root);
		
		
		System.out.println("\nInOrder Traversal ");
		bt.inOrder(bt.root);
		
		System.out.println("\nPostOrder Traversal");
		bt.postOrder(bt.root);
		
		System.out.println("\nLevelOrder Traversal");
		bt.levelOrder();
	}

}
