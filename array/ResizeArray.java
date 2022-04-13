package array;

public class ResizeArray {

	public void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public int[] resize(int[] arr,int capacity) {
		int[] temp=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		printArray(temp);
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizeArray r=new ResizeArray();
		int[] original= {3,4,6,4,9};
		r.printArray(original);
		System.out.println("the size of original array - "+original.length);
		original=r.resize(original, 10);
		System.out.println("the size of original array after resize - "+original.length);
	}

}
