import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class fastsearch {
	static class cord implements Comparator<cord>, Comparable<cord> {
		int x, y;

		public cord(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return this.x + " " + this.y;
		}

		public int compare(cord o1, cord o2) {
			// TODO Auto-generated method stub
			if (o1.y > o2.y) {
				return -1;
			} else {
				return 1;
			}
		}

		@Override
		public int compareTo(cord o) {
			// TODO Auto-generated method stub
			if (y > o.y)
				return -1;
			else {
				return 1;
			}
		}
	}

	public static void main(String[] arg) throws IOException {
		String st = "5\n" + "1 2\n" + "5 3\n" + "4 6\n" + "7 5\n" + "9 0\n";
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(sc.readLine());
		cord []  tr =new cord[n];
		for (int i = 0; i < n; i++) {
			String[] st1 = sc.readLine().split(" ");
			int x = Integer.parseInt(st1[0]);
			int y = Integer.parseInt(st1[1]);
			tr[i]=new cord(x, y);
			}	
		Arrays.sort(tr);
		int maxx = -1;
		for (cord i : tr) {
			if (i.x >= maxx) {
				maxx = i.x;
				System.out.format("%d %d\n",i.x,i.y);
				
			}
		}
	}
}
