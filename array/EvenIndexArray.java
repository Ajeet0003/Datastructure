package array;

public class EvenIndexArray {
	int[] array = {3,44,2,1,7,9,90,4};
	
	public void evenPrint() {
		for(int i =0;i<array.length;i++) {
			if(array[i]%2!=0 ) {
				System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenIndexArray arr =new EvenIndexArray();
		arr.evenPrint();
	}

}
