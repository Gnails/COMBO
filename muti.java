import java.util.Scanner;

 class muti {
	public static void main(String [ ] args) {
		Scanner sc = new Scanner(System.in);
		long[] arr = new long[20000];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		long max1s = 0, max2s = 0, max3s = 0, min1s = 0, min2s = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max1s) {
				max3s = max2s;
				max2s = max1s;
				max1s = arr[i];
			} else if (arr[i] > max2s) {
				max3s = max2s;
				max2s = arr[i];
			} else if (arr[i] > max3s)
				max3s = arr[i];
			if (arr[i] < min1s) {
				min2s = min1s;
				min1s = arr[i];
			} else if (arr[i] < min2s)
				min2s = arr[i];
		}
		System.out.print(Math.max(max3s * max2s * max1s, min1s * min2s * max1s));
	}

}
