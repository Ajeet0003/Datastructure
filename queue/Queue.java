package queue;

import java.util.NoSuchElementException;

public class Queue {
	private ListNode front;
	private ListNode rear;
	private int length;

	public class ListNode {
		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int length() {
		return length;
	}

	public boolean isSpace() {
		return length == 0;
	}

	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if (isSpace()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	public int dequeue() {
		if (isSpace()) {
			throw new NoSuchElementException();
		}

		int result = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		length--;
		return result;

	}

	public void print() {
		if (isSpace()) {
			return;
		}
		ListNode current = front;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		q.print();
		
		q.dequeue();
		
		q.print();
	}

}
