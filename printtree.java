import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class printtree {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

		public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

			ArrayList<Integer> al = new ArrayList<Integer>();
			LinkedBlockingQueue<TreeNode> bq = new LinkedBlockingQueue<TreeNode>();
			if (root != null)
				bq.offer(root);
			else
				return al;
			while (!bq.isEmpty()) {
				TreeNode tmp;
				try {
					tmp = bq.take();

					al.add(tmp.val);
					if (tmp.left != null) {
						bq.offer(tmp.left);
					}
					if (tmp.right != null) {
						bq.offer(tmp.right);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return al;

		}
	}
}
