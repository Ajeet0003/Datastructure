package array;

public class SecondMaxValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,33,90,24,7,33,9,90};
		
		int largest=Integer.MIN_VALUE;
		int SecLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				SecLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>SecLargest && arr[i]!=largest) {
				SecLargest=arr[i];
			}
		}
		System.out.println("Second largest value is "+SecLargest);
	}

}
