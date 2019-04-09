public class CopyList {
	public class RandomListNode {
		int label;
		RandomListNode next = null;
		RandomListNode random = null;

		RandomListNode(int label) {
			this.label = label;
		}
	}

	public RandomListNode Clone(RandomListNode pHead) {
		RandomListNode clonednode, currentListNode = pHead;
		while (currentListNode != null) {
			clonednode = new RandomListNode(currentListNode.label);
			clonednode.random = currentListNode.random;
			clonednode.next = currentListNode.next;
			currentListNode.next = clonednode;
			currentListNode = currentListNode.next.next;
		}
		currentListNode = pHead;
		while (currentListNode != null) {
			currentListNode.next.random = (currentListNode.next.random == null) ? null
					: currentListNode.next.random.next;
			currentListNode = currentListNode.next.next;

		}
		RandomListNode clonedHead = pHead.next;
		currentListNode = pHead;
		clonednode = pHead.next;
		while (currentListNode.next.next != null) {
			RandomListNode cloneNode = currentListNode.next;
			currentListNode.next = cloneNode.next;
			cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
			currentListNode = currentListNode.next;

		}
		return clonedHead;
	}

	public static void main(String[] args) {
		CopyList cp = new CopyList();
		RandomListNode head = cp.new RandomListNode(-1);
		RandomListNode tmp = head;
		for (int i = 0; i < 10; i++) {
			tmp.next = cp.new RandomListNode(i);
			tmp = tmp.next;
		}
		cp.Clone(head);
	}
}
