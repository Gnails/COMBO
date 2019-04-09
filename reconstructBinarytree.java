
public class reconstructBinarytree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return reConstructBinaryTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in, int startpr, int endpr, int startin, int endin) {

		if (startpr > endpr || startin > endin)
			return null;
		TreeNode r = new TreeNode(pre[startpr]);
		for (int k = startin; k <= endin; k++)
			if (pre[startpr] == in[k]) {
				int newendpr = k - startpr;
				r.left = reConstructBinaryTree(pre, in, startpr + 1, startpr + newendpr, startin, k - 1);
				r.right = reConstructBinaryTree(pre, in, startpr + newendpr + 1, endpr, k + 1, endin);
				break;
			}
		return r;
	}

}
