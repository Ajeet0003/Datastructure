package array;

public class Array {
	public void printArray(int[] array){
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public void arrayList() {
		int[] array=new int[5];
		array[0]=1;
		array[1]=6;
		array[2]=8;
		array[3]=9;
		array[4]=7;
		printArray(array);
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array arr=new Array();
		arr.arrayList();
	}

}
