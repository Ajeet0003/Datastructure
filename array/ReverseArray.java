package array;

public class ReverseArray {
	int[] array = { 2, 4, 99, 90, 1 };
	
	

	public void reverseArray() {
		System.out.println("array");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse Array");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ReverseArray arr=new ReverseArray();
		arr.reverseArray();

	}

}
