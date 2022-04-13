package linkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void display() {
		if (tail == null) {
			return;
		}
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}

	public ListNode deleteFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if (head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}

	public ListNode deleteLast() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else {
			ListNode temp = tail;
			if (head == tail) {
				head = null;
			} else {
				tail.previous.next = null;
			}
			tail = tail.previous;
			temp.previous = null;
			length--;
			return temp;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(3);
		dll.insertFirst(2);
		dll.insertFirst(1);

		dll.insertLast(4);
		dll.insertLast(5);
		dll.insertLast(6);

		dll.deleteFirst();

		dll.deleteLast();

		dll.display();

	}

}
