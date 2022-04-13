package array;

public class SecondMaxArray {
	int[] array = { 12, 23, 3, 333, 33, 34, 34, 34, 34, 333, 333, 100 };

	public void maxArray() {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[i + 1]) {

				System.out.println(array[i + 1]);
				break;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondMaxArray arr = new SecondMaxArray();
		// System.out.println(Integer.MIN_VALUE);
		arr.maxArray();
	}

}
