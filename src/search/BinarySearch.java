package search;

public class BinarySearch {

	public BinarySearch(int[] a, int b) {
		System.out.println(search(a, 0, a.length-1, b));
	}

	public int search(int[] a, int low, int hi, int value) {
		
		if (low <= hi) {
			int mid = (low + hi) / 2;
			System.out.println("mid "+mid);
			if (value == a[mid]) {
				return mid;
			} else if (value < a[mid]) {
				return search(a, low, mid - 1, value);
			} else if (value > a[mid]) {
				return search(a, mid+1, hi, value);
			}

		}

		return -1;
	}
}
