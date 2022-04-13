package linkedList;

import java.util.Scanner;

public class HCF {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public HCF() {
		this.head = null;
	}

	public void append(int data) {
		if (head == null)
			head = new ListNode(data);
		else {
			ListNode h;
			for (h = head; h.next != null; h = h.next)
				;
			h.next = new ListNode(data);
		}
	}

	public void find(int h, int r) {
		HCF fact1 = new HCF();
		HCF fact2 = new HCF();
		HCF fact3 = new HCF();
		for (int i = 1; i <= h / 2; i++) {
			if (h % i == 0)
				fact1.append(i);
		}
		fact1.append(h);

		for (int i = 1; i <= r / 2; i++) {
			if (r % i == 0)
				fact2.append(i);
		}
		fact2.append(r);

		for (ListNode i = fact1.head; i != null; i = i.next) {
			for (ListNode j = fact2.head; j != null; j = j.next) {
				if (i.data == j.data)
					fact3.append(j.data);
			}
		}
		ListNode k;
		for (k = fact3.head; k.next != null; k = k.next)
			;
		System.out.println("HCF of " + h + " and " + r + " is : " + k.data);
	}

	public static void main(String[] args) {
		HCF fct = new HCF();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number to get its HCF : ");
		int f = sc.nextInt();
		System.out.print("Enter second number to get its HCF : ");
		int s = sc.nextInt();
		fct.find(f, s);

	}

}
