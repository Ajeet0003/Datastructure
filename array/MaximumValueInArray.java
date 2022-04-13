package array;

public class MaximumValueInArray {
	int[] array = { 2, 4, 1, 0, 33,  -1, 8, 9 };

	public void maxArray() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				
			}
		}
		System.out.println(max+"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumValueInArray arr = new MaximumValueInArray();
		arr.maxArray();
	}
}