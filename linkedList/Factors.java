package linkedList;

import java.util.Scanner;

public class Factors {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Factors() {
		this.head = null;
	}

	public void append(int data) {
		if (head == null)
			head = new ListNode(data);
		else {
			ListNode p;
			for (p = head; p.next != null; p = p.next)
				;
			p.next = new ListNode(data);
		}
	}

	public void get(int f) {

		for (int i = 1; i <= f / 2; i++) {
			if (f % i == 0)
				append(i);
		}
		append(f);
		print();
	}

	public void print() {
		System.out.println("Factors of this number is : ");
		for (ListNode l = head; l != null; l = l.next)
			System.out.print(l.data + " ");
	}

	public static void main(String[] args) {
		Factors fact = new Factors();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to get its factors : ");
		int f = sc.nextInt();
		fact.get(f);

	}

}
