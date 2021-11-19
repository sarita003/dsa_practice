package com.linkedlist;

public class FindMiddleOfLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		
		LinkedList.Node  node1 = ll.insertAtBegining(null, 10);
		ll.insertAtEnd(node1, 20);
		ll.insertAtEnd(node1, 30);
		ll.insertAtEnd(node1, 40);
		ll.insertAtEnd(node1, 50);
		System.out.println("Linked List : ");
		ll.printLinkedList(node1);
		System.out.println();
		
		LinkedList.Node		 mid = getMiddleNode(node1);
		System.out.println("Middle Node :" + mid.data);
	}
	
	static LinkedList.Node  getMiddleNode(LinkedList.Node  head){
		
		LinkedList.Node  slow =head;
		LinkedList.Node  fast = head;
		
		while( fast != null &&fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
		
		
	}

}
