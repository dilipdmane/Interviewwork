package com.hackerrank.work.problemsolving.week8.day25;

import com.hackerrank.work.problemsolving.week8.day25.NodeStudy.Node;

public class NodeStudy {
	private Node getHeadNode( int[] A)
	{
		Node headNode = null;
		Node returnNode = null;
		Node nextNode = null;
		headNode = new Node(A[0],null);
		returnNode = headNode;
		for (int i = 0; i < A.length; i++) {
			nextNode = new Node(A[i], null);
			headNode.setNextNode(nextNode);
			headNode = nextNode;			
		}
		
		return returnNode;
	}
	
	void printValue( Node headNode)
	{
		
		while(headNode!=null )
		{
			headNode = headNode.nextNode;
			System.out.print(headNode.data);
		}
	}
	
	public boolean deleteNode(Node Head , int value)
	{
		
		
		if( Head.data == value)
		{
			Node temp = Head;
			Head = Head.nextNode;
			temp.setNextNode(null);
			return true;
		}
		
		Node tempNode = Head.nextNode;
		Node prevNode = Head;
		
		while( tempNode !=null )
		{
			if( tempNode.data == value)
			{
				prevNode.setNextNode(tempNode.nextNode);
				tempNode.setNextNode(null);
				return true;
			}
		prevNode = tempNode;
		tempNode = tempNode.nextNode;
		}
		
		return false;
		
	}
	
	
	
	class Node
	{
		int data;
		Node nextNode = null;
		public Node( int data, Node nextNode) {
			this.data = data;
			this.nextNode = nextNode;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
		
	}
	
	
	
}
