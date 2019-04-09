import java.util.ArrayList;
import java.util.Stack;

public class ISposter {
	public static boolean IsPopOrder(int[] pushA, int[] popA) {
		Stack<Integer> x = new Stack<Integer>();

		int start=0;
		
		for(int i=0;i<pushA.length;i++) {
			x.push(pushA[i]);
			while(!x.isEmpty()&&x.peek()==popA[start]) {
				x.pop();
				start++;
			}
		}
		return x.isEmpty();

	}
//	public static boolean IsPopOrder(int[] pushA, int[] popA) {
//		Stack<Integer> x = new Stack<Integer>();
//		ArrayList<Integer> ls = new ArrayList<Integer>();
//		int start = 0, k = 0;
//		for (int i = 0; i <= popA.length - 1; i++) {
//			k = findx(pushA, popA[i]);
//			if (k < 0)
//				return false;
//			if (k > start) {
//				for (int q = start; q <= k; q++) {
//					if (ls.contains(pushA[q])) {
//						continue;
//					}
//					System.out.println("push " + pushA[q]);
//					x.push(pushA[q]);
//				}
//				start=k;
//			}
//			if (k <= start) {
//				while (!x.isEmpty()) {
//					ls.add(x.pop());
//					if (ls.get(ls.size() - 1) == pushA[k])
//						break;
//				}		
//			}
//			}
//			
//		for (int i = 0; i < ls.size(); i++) {
//			if (ls.get(i) != popA[i])
//				return false;
//		}
//		return true;
//
//	}
//	static int findx(int[] PushA, int x) {
//		for (int i = 0; i < PushA.length; i++)
//			if (PushA[i] == x)
//				return i;
//		return -1;
//	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 }, b = { 4, 5, 3, 2, 1 };
		System.out.print(IsPopOrder(a, b));
	}

}
