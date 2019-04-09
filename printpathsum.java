import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;
	}
}

public class printpathsum {
	
	public static void main(String[] args) {
		TreeNode x = new TreeNode(9);
		System.out.print(FindPath(x, 9));
	}

	static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		Stack<Boolean> vistnode = new Stack<Boolean>();
		Stack<Integer> sst = new Stack<Integer>();
		boolean ispop = false;
		int sum = root.val;
		st.push(root);
		sst.push(sum);
		vistnode.push(false);
		while (!st.isEmpty()) {
			while (!st.isEmpty() && (st.peek().left != null)) {
				st.push(st.peek().left);
				sst.push(st.peek().val + st.peek().left.val);
				vistnode.push(false);
			}
			while (!st.isEmpty() && (st.peek().right == null || vistnode.peek())) {
				sum = sst.pop();
				ispop = vistnode.pop();
				if (sum == target && !ispop) {
					ls.add(new ArrayList<Integer>());
					for (TreeNode i : st) {
						ls.get(ls.size() - 1).add(i.val);
					}
				}
				root = st.pop();
			}
			if(vistnode.isEmpty())
				break;
			vistnode.pop();
			vistnode.push(true);
			vistnode.push(false);
			st.push(root.right);
			sst.push(sst.peek() + root.right.val);
		}
		ls.sort(new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				if (o1.size() > o2.size())
					return -1;
				else
					return 1;
			}
		});
		return ls;
	}

}
