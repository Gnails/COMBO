import java.util.ArrayList;

import javax.swing.plaf.SliderUI;

public class feibola {
	 public int Fibonacci(int n) {
		 ArrayList<Integer > ls= new ArrayList<Integer>();
		 ls.add(0);
		 ls.add(n);
		 for(int i=2;i<n;i++) {
			 ls.add(ls.get(ls.size()-1)+ls.get(ls.size()-2));
		 }
		 return ls.get(ls.size()-1);

	    }
}
