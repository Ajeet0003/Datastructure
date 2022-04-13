package linkedList;

public class SinglyLinkedList {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public SinglyLinkedList() {
		this.head = null;
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " -->  ");
			current = current.next;
		}
		System.out.println("null");
	}

	public int length() {
		if (head == null)
			return 0;
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void insertAtBegining(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	public void insert(int position, int value) {
		ListNode node = new ListNode(value);
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;

			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}

	public ListNode deleteFirst() {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	public ListNode deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	public void deleteAtAnyPosition(int position) {
		
		if(position==1) {
			head=head.next;
		}
		ListNode previous=head;
		for(int i=1;i<position-1;i++) {
			previous=previous.next;
		}
		ListNode current = previous.next;
		previous.next=current.next;
		
		
	}
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

		// Now we will connect them together to form a chain
		sll.head.next = second;
		second.next = third;
		third.next = forth;

		sll.insertAtBegining(12);
		sll.insertAtBegining(4);
		sll.insertAtBegining(14);

		sll.insertLast(111);
		sll.insertLast(84);
		sll.insertLast(17);

		sll.insert(1, 3);

		sll.display();

	//	sll.deleteLast();
		
		sll.deleteAtAnyPosition(3);

		//System.out.println(sll.deleteFirst().data);

		sll.display();
		System.out.println("Length is  " + sll.length());
	}
}
