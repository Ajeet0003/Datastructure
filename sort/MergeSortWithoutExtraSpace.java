package sort;

//3. Modify Merge Sort by using Insertion Logic. This will eliminate AUX array.

public class MergeSortWithoutExtraSpace {

	public void merge(int[] arr1, int[] arr2) {

		int n = arr1.length;
		int m = arr2.length;

		int i = 0;
		int j = 0;

		while (i < n) {
			if (arr1[i] > arr2[j]) {
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				fixArray(arr2);
				fixArray(arr1);
			}
			i++;
			fixArray(arr2);
		}
	}

	public void printArray(int arr[]) {
		// int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void fixArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				int temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortWithoutExtraSpace ms = new MergeSortWithoutExtraSpace();
		int[] arr1 = { 1, 3, 0, 5, 7, 1, 0, 14, 33, 21, 333 };
		int[] arr2 = { 0, 2, 6, 8, 1, 8, 0, 9, 11 };

		ms.merge(arr1, arr2);

		ms.printArray(arr1);
		ms.printArray(arr2);

	}
}