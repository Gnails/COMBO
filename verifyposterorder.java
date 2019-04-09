public class verifyposterorder {/*
	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0)
			return false;
		return verify(sequence, 0, sequence.length - 1);
	}

	int partion(int[] sequence, int s, int e) {
		int pp = e;
		int start = s;
		while ((sequence[start] < sequence[e] && pp == e))
			start++;
		pp = start;
		while (sequence[start] > sequence[e] && pp < e)
			start++;
		if (start < e)
			pp = -1;
		return pp;
	}

	boolean verify(int[] sequence, int s, int e) {
		if (s >= e)
			return true;
		int pp = partion(sequence, s, e);
		if (pp != -1 && verify(sequence, s, pp - 1) && verify(sequence, pp, e - 1)) {
			return true;
		} else
			return false;
	}*/
	public boolean VerifySquenceOfBST(int[] sequence) {
		if(sequence.length==0)
			return false;
		int size=sequence.length;
		int i=0;
		while(--size>=0) {
			while(sequence[i++]<sequence[size]);
			while (sequence[i]>sequence[size]) 
				i++;
			if(i<size)
				return false;		
			i=0;
		}
		return true;
	}
}
