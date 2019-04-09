import javax.naming.ldap.SortControl;

public class rotateminnum {
	public static int minNumberInRotateArray(int[] array) {
		if (array.length == 0)
			return 0;
		return find(array, 0, array.length - 1);

	}

	static int find(int[] array, int start, int end) {
		while (start < end) {
			int mid = (end + start) / 2;
			if (array[mid] > array[end]) {
				start = mid + 1;
			} else if (array[mid] < array[end]) {
				end = mid;
			}
			else if(array[mid]==array[end]) {
				end--;
			}
		}
		return array[start];
	}

	public static void main(String[] args) {
		int[] array = { 234, 3214, 25283, 0,5, 9 };
//			{ 3, 4, 5, 1, 2 };
		System.out.print(minNumberInRotateArray(array));
	}
}
