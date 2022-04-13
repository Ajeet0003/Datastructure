package linkedList;

import java.util.Scanner;

public class Addition {
	
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

	public Addition() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}


	public void addNums(String num1, String num2) {
		Addition L1 = new Addition();
		Addition L2 = new Addition();
		Addition L3 = new Addition();

		int carry = 0;
		for (int i = 0; i < num1.length(); i++)
			L1.addFront(num1.charAt(num1.length() - 1 - i) - 48);
		for (int i = 0; i < num2.length(); i++)
			L2.addFront(num2.charAt(num2.length() - 1 - i) - 48);


		if (L1.length >= L2.length) {
			
			for (int i = L1.length; i > 0; i--) {
				
				if (L2.tail != null) { 
					if (i == 1)
						L3.addFront(L1.tail.data + L2.tail.data + carry);
					else
						L3.addFront((L1.tail.data + L2.tail.data + carry) % 10);
																				// 3
					if (L1.tail.data + L2.tail.data + carry >= 10)
						carry = 1;
					else
						carry = 0;
					L1.tail = L1.tail.previous; 
					L2.tail = L2.tail.previous;
				} else {
					if (L1.tail.data + carry >= 10)
						carry = 1;
					else
						carry = 0;
					if (i == 1)
						L3.addFront(L1.tail.data + carry);
					else
						L3.addFront((L1.tail.data + carry) % 10);
					L1.tail = L1.tail.previous;
				}
			}
		} else {
			for (int i = L2.length; i > 0; i--) {
				if (L1.tail != null) {
					L3.addFront((L1.tail.data + L2.tail.data + carry) % 10);
					if (L1.tail.data + L2.tail.data + carry >= 10)
						carry = 1;
					else
						carry = 0;
					L1.tail = L1.tail.previous;
					L2.tail = L2.tail.previous;
				} else {
					if (L2.tail.data + carry >= 10)
						carry = 1;
					else
						carry = 0;
					if (i == 1)
						L3.addFront(L2.tail.data + carry);
					else
						L3.addFront((L2.tail.data + carry) % 10);
					L2.tail = L2.tail.previous;
				}
			}

		}
		L3.print();
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void addFront(int data) {
		ListNode node = new ListNode(data);
		if (isEmpty())
			tail = node;
		else
			head.previous = node;
		node.next = head;
		head = node;
		length++;
	}

	public void addEnd(int data) {
		ListNode node = new ListNode(data);
		if (isEmpty())
			head = node;
		else
			tail.next = node;
		node.previous = tail;
		tail = node;
		length++;
	}

	public void print() {
		System.out.print("Addition of these number is : ");
		for (ListNode tmp = head; tmp != null; tmp = tmp.next)
			System.out.print(tmp.data);

		System.out.println();
	}

	public static void main(String[] args) {
		Addition L1 = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number for addition");
		String num1 = sc.nextLine();
		System.out.println("Enter Second number for addition");
		String num2 = sc.nextLine();
		L1.addNums(num1, num2);

	}

}


