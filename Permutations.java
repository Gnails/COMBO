import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Permutations {
	ArrayList<String> list = new ArrayList<String>();

	public ArrayList<String> Permutation(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
	
		process(new String(ch), 0);
		Collections.sort(list);
		

	}

	ArrayList<String> process(String str, int start) {
		if (start == str.length() - 1) {
			if (!list.contains(str))
				list.add(str);
			return list;
		}
		
		for (int i = start; i < str.length(); i++) {
			process(swap(str.toCharArray(), start, i), start + 1);
		}
		return list;
	}

	String swap(char[] ch, int start, int i) {
		char tmp = ch[i];
		ch[i] = ch[start];
		ch[start] = tmp;
		return new String(ch);

	}

	public static void main(String[] args) {
		Permutations s = new Permutations();
		for (String x : s.Permutation("aaa")) {
			System.out.println(x);
		}
	}
}
