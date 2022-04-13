package exam;
//Q2. Implement both PUSH and POP operation on STACK using linked list.	

public class Stack {
		private ListNode top;
		private int length;
		
		private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	public Stack() {
		top=null;
		length=0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	public void push(int data) {
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	public int pop() throws  EmptyException {
		if(isEmpty()) {
			throw new  EmptyException();
		}
		int result =top.data;
		top=top.next;
		length--;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		stack.push(11);
		stack.push(12);
		stack.push(15);
		try {
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		}
		catch(EmptyException e){
			System.out.println(e);
		}
		
	}

}
