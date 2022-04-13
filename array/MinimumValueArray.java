package array;

public class MinimumValueArray {
	int[] array = { 2, 4, 1, 0, -1, 8, 9 };

	public void minArray() {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumValueArray arr = new MinimumValueArray();
		arr.minArray();
	}
}