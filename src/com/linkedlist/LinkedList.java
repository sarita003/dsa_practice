package com.linkedlist;

public class LinkedList {

	Node head;
	
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node insertAtBegining(Node head, int data) {
		
		Node tmp = new Node(data);
		if(head == null) {
			head = tmp;
		}else {
			head = tmp;
			tmp.next = head;
			
		}
		System.out.println("Head : " + head.data);
		return head;
	}
	void insertAtEnd(Node head, int data) {
		
		Node tmp = new Node(data);
		if(head == null) {
			head = tmp;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = tmp;
		tmp.next = null;
	}
	
	void printLinkedList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}
