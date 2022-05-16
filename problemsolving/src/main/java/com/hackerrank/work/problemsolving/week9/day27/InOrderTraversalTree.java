package com.hackerrank.work.problemsolving.week9.day27;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Stack;

public class InOrderTraversalTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Integer> inorderTraversal(TreeNode A) {
		ArrayList<Integer> retList = new ArrayList<>();
		Stack<TreeNode> leftNodeStack = new Stack<TreeNode>();

		TreeNode currNode = A;
		
		while (currNode !=null ) {
			if( currNode.left != null )
			{
				leftNodeStack.push(currNode);
				currNode= currNode.left;
			}
			else
			{
				retList.add(currNode.val);
				if( currNode.right != null )
				{
					currNode = currNode.right;
				}
				else 
				{
					currNode = leftNodeStack.pop();
					
					if( currNode !=null )
					{
						retList.add(currNode.val);
						currNode = currNode.right;
					}
				}
				
			}
		}

		

		return retList;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}

}
