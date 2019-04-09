import java.util.ArrayList;

public class topKey {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		for (int i = k / 2 - 1; i >= 0; i--) {
			adjustHeap(input, i, k - 1);
		}
		for (int i = k; i < input.length; i++) {
			if (input[0] > input[i]) {
				input[0] = input[i];
				adjustHeap(input, 0, k - 1);
			}
		}
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < k; i++)
			ls.add(input[i]);
		return ls;

	}

	public void adjustHeap(int[] input, int pos, int length) {
		for (int tmp = input[pos]; 2 * pos + 1 <= length;) {
			int child = 2 * pos + 1;
			if (child<length&&input[child + 1] > input[child])
				child++;
			if (input[child] > tmp) {
				input[pos] = input[child];
				input[child] = tmp;
				pos = child;
			} else {
				break;
			}
		}
	}
	public static void main(String[] args) {
		topKey k=new topKey();
		int [] x= {4,5,1,6,2,7,3,8};
		k.GetLeastNumbers_Solution(x, 8);
	}
}
