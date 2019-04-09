import java.util.ArrayList;

public class veryFilySpecifiedValue {

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> tmp = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null)
			return list;
		tmp.add(root.val);
		target -= root.val;
		if(target==0&&root.left==null&&root.right==null) {
			list.add(new ArrayList<Integer>(tmp));
			return list;
		}
		FindPath(root.left, target);
		FindPath(root.right, target);
		tmp.remove(tmp.size()-1);
		return list;
	

	}

}
