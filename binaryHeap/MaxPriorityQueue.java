package binaryHeap;

public class MaxPriorityQueue {
	private Integer[] heap;
	private int n;
	
	public MaxPriorityQueue(int capacity) {
		heap=new Integer[capacity+1];
		n=0;
	}
	public boolean isEmpty() {
		return n==0;
	}
	public int size() {
		return n;
	}
	public void insert(int x) {
		if(n==heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n]=x;
		swim(n);
	}
	private void swim(int k) {
		while(k>1 && heap[k/2]<heap[k]) {
			int temp=heap[k];
			heap[k]=heap[k/2];
			heap[k/2]=temp;
			k=k/2;
		}
	}
	private void resize(int capacity) {
		Integer[] temp=new Integer[capacity];
		for(int i=0;i<heap.length;i++) {
			temp[i]=heap[i];
		}
		heap=temp;
	}
	public void printMaxHeap() {
		for(int i=1;i<=n;i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxPriorityQueue pq=new MaxPriorityQueue(3);
		
		pq.insert(2);
		pq.insert(7);
		pq.insert(4);
		pq.insert(5);
		pq.insert(6);
		
		pq.printMaxHeap();
		
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		
	}

}