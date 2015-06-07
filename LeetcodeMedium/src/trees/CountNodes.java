package trees;

import java.util.ArrayList;
import java.util.List;

public class CountNodes {
	
	int c = 0;
	public int countNodes(TreeNode root) {
		if(root == null) {
			c++;
			return 0;
		}
		/*
		List<TreeNode> queue = new ArrayList<TreeNode>();
		queue.add(root);
		int total = 1;
		while(!queue.isEmpty()) {
			if (queue.get(0).left != null) {
				queue.add(queue.get(0).left);
				total++;
			}
			if (queue.get(0).right != null) {
				queue.add(queue.get(0).right); 
				total++;
			}
			queue.remove(0);
		}
		return total; 
		*/
		c++;
		return (root == null) ? 0 : 1 + countNodes(root.left) + countNodes(root.right); 
	}
	
	public TreeNode makeTree() {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode7 = new TreeNode(7);
		treeNode4.left = treeNode2;
		treeNode4.right = treeNode6;
		treeNode2.left = treeNode1;
		treeNode2.right = treeNode3;
		treeNode6.left = treeNode5;
		treeNode6.right = treeNode7;
		return treeNode4;
	}
	
	public static void main(String[] args) {
		CountNodes test = new CountNodes();
		TreeNode treeNodes = new TreeNode(1);
		treeNodes.left = new TreeNode(2);
		System.out.println(test.countNodes(test.makeTree()));
		System.out.println(test.c);
	}
}
