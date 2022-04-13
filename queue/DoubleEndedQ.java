package queue;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoubleEndedQ {
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

	public void enqueueFromRear(int data) {
		ListNode temp = new ListNode(data);
		if (isSpace()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	public void enqueueFromFront(int data) {
		ListNode temp = new ListNode(data);
		if (isSpace()) {
			rear = temp;
		} else {
			temp.next = front;
		}
		front = temp;
		length++;
	}
	public int dequeueFromFront() {
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
	public int dequeueFromRear() {
		if (isSpace()) {
			throw new NoSuchElementException();
		}
		int result =rear.data; 
		
		if (front.next == null) {
			rear = null;
			front=null;
		}
		
		ListNode current = front;
		ListNode previous=null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		rear=previous;
		
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
		DoubleEndedQ dq=new DoubleEndedQ();
		int option;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for performing following operation");
		System.out.println("1: for inset an item from front");
		System.out.println("2: for inset an item from rear");
		System.out.println("3: for delete an item from front");
		System.out.println("4: for delete an item from rear");
		System.out.println("5: for display item ");
		System.out.println("0: exit");
		
		System.out.println("Enter your choice");
		 option=sc.nextInt();
		
		int item;
		
		switch(option) {
		case 1:
			System.out.println("Enter item for insert");
			item=sc.nextInt();
			dq.enqueueFromFront(item);
			break;
		case 2:
			System.out.println("Enter item for insert");
			item=sc.nextInt();
			dq.enqueueFromRear(item);
			break;
		case 3:
			dq.dequeueFromFront();
			System.out.println("Delete successful");
			break;
		case 4:
			dq.dequeueFromRear();
			System.out.println("Delete successful");
			break;
		case 5:
			dq.print();
			break;
		case 0:
			System.out.println("End Programme");
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		}
		while(option!=0);
		
		/*dq.enqueueFromFront(1);
		dq.enqueueFromFront(2);
		dq.enqueueFromFront(3);
		dq.print();
		dq.enqueueFromRear(4);
		dq.enqueueFromRear(5);
		dq.enqueueFromRear(6);
		
		dq.print();
		
		
		dq.dequeueFromRear();
		dq.dequeueFromRear();
		dq.print();
		
		dq.dequeueFromFront();
		dq.print();
		*/
	
	}
}
