import java.util.ArrayList;

import javax.security.auth.callback.ConfirmationCallback;

public class childStru {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}

	}

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		return findB(root1, root2);
	}

	public boolean findB(TreeNode A, TreeNode B) {
		if (B == null || A == null)
			return false;
		if (A.val == B.val) {
			if (confirm(A, B))
				return true;
		}
		if (findB(A.left, B) || findB(A.right, B))
			return true;

		return false;
	}

	public boolean confirm(TreeNode A, TreeNode B) {
		if (B == null)
			return true;
		if (A == null)
			return false;
		if (A.val == B.val) {
			if (confirm(A.left, B.left) && confirm(A.right, B.right))
				return true;
		}
		return false;

	}
}
