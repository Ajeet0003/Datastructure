package array;

public class EvenPrint {	
	public int evenPrint(int[] array) {
		int oddcount=0;
		for(int i =0;i<array.length;i++) {
			if(array[i]%2!=0 ) {
				oddcount++;
				//System.out.println(array[i]);
			}
		}
		int[] arr=new int[oddcount];
		int idx=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				arr[idx]=array[i];
				System.out.println(arr[idx]+" ");
				idx++;
			}
		}
		idx--;
		return arr[idx];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra = {3,44,2,1,7,9,90,4};
		EvenPrint arry =new EvenPrint();
		arry.evenPrint(arra);
	}

}
