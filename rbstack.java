import java.util.Stack;

public class rbstack {

	Stack<Integer> st = new Stack<Integer>();
	final int maxsize = 99999;
	int[] hash = new int[maxsize];
	int minx = 999999;

	Solution( ){
        for(int i=0;i<maxsize;i++)
            hash[i]=0;
    }

	public void push(int node) {
		if (node < minx) {
			minx = node;
		}
		st.push(node);
		hash[node]++;
	}

	public void pop() {
		int tmp = st.pop();
		hash[tmp]--;
		if (tmp == minx && hash[tmp] == 0) {
			int flag = 0;
			for (int i = tmp; i < maxsize; i++) {
				if (hash[i] > 0) {
					minx = i;
					flag = 1;
					return;
				}
			}
			if (flag == 0)
				minx = maxsize;
		}
	}

	public int top() {
		return st.peek();

	}

	public int min() {
		return minx;

	}
}
