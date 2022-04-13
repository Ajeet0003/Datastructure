package stack;

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
	public int pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result =top.data;
		top=top.next;
		length--;
		return result;
	}
	public int peek() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		stack.push(10);
		stack.push(12);
		stack.push(33);
		try {
		System.out.println(stack.peek());
		}
		catch(EmptyStackException e){
		System.out.println(e);	
		}
	}

}
