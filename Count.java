import java.util.HashMap;

public class Count {
	HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

	public int MoreThanHalfNum_Solution(int[] array) {
		for (int x : array) {
			if (!hashmap.containsKey(x))
				hashmap.put(x, 1);
			else {
				hashmap.put(x, hashmap.get(x) + 1);
			}
		}
		for(Integer x: hashmap.keySet()) {
			if(hashmap.get(x)>array.length/2)
				return x;
		}
		return 0;

	}

}
