import java.util.ArrayList;

public class BSTtoDualList {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	TreeNode headNode = null;
	TreeNode realheadNode = null;

	public TreeNode Convert(TreeNode pRootOfTree) {
		ConvertSub(pRootOfTree);
		return realheadNode;

	};

	public void ConvertSub(TreeNode pRootOfTree) {
		if (pRootOfTree == null)
			return;
		ConvertSub(pRootOfTree.left);
		if (headNode == null) {
			headNode = pRootOfTree;
			realheadNode = headNode;
		} else {
			headNode.right = pRootOfTree;
			pRootOfTree.left = headNode;
			headNode = pRootOfTree;
		}
		ConvertSub(pRootOfTree.right);

	}
}
