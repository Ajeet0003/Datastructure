package array;

public class MoveZeroes {
	public void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void arrayDemo() {
		int[] arr= {0,0,0,2,4,5,0,4,0,4,77,0};
		printArray(arr);
		moveZeroes(arr);
		printArray(arr);
	}
	public void moveZeroes(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroes m=new MoveZeroes();
		m.arrayDemo();
	}

}
