package info.sortings;

public class Mergesort {

	public static void main(String[] args) {

		int[] array = readArray();
		System.out.println("input array:");
		printArray(array);
		sort(array);
		System.out.println("sorted array:");
		printArray(array);
	}

	public static void sort(int[] input) {

		mergeSort(input, 0, input.length - 1);

	}

	// recursive algorithm
	// merge sort call itself
	public static void mergeSort(int[] input, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			// divide part
			mergeSort(input, low, mid);
			mergeSort(input, mid + 1, high);
			// conquer part
			merge(input, low, mid, high);
			printArray(input);
		}

	}

	public static void merge(int[] input, int low, int mid, int high) {

		// we take temparary array to store sorted values
		// and copy temparary array to original array whose elements is sorted order

		// size of temparary array is sum of two subarrays
		int[] temp = new int[high - low + 1];
		int left = low;
		int right = mid + 1;
		int k = 0;

		while (left <= mid && right <= high) {
			if (input[left] < input[right]) {
				temp[k] = input[left];
				left = left + 1;
			} else {
				temp[k] = input[right];
				right = right + 1;
			}
			k = k + 1;
		}

		if (left <= mid) {
			while (left <= mid) {
				temp[k] = input[left];
				left = left + 1;
				k = k + 1;
			}
		}

		else if (right <= high) {
			while (right <= high) {
				temp[k] = input[high];
				right = right + 1;
				k = k + 1;
			}
		}

		for (int m = 0; m < temp.length; m++) {
			input[low + m] = temp[m];

		}

	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ,");
		}

		System.out.println("\n-------------------");

	}

	public static int[] readArray() {
		int[] a = { 13, 14, 28,25, 9, 8,10,4};
		return a;
	}

}
