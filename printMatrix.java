import java.util.ArrayList;

public class printMatrix {
	public static ArrayList<Integer> printMatrix1(int[][] matrix) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		int sx = 0, sy = 0, ey = matrix.length - 1, ex = matrix[0].length - 1;
		while (sx <= ex && sy <= ey) {
			if (sx == ex) {
				for (int i = sy; i <= ey; i++)
					ls.add(matrix[i][sx]);
				return ls;
			}
			if (sy == ey) {
				for (int i = sx; i <= ex; i++)
					ls.add(matrix[sy][i]);
				return ls;
			}
			for (int i = sx; i <= ex; i++) {
				ls.add(matrix[sy][i]);
			}
			for (int i = sy + 1; i <= ey; i++) {
				ls.add(matrix[i][ex]);
			}
			for (int i = ex - 1; i >= sx; i--) {
				ls.add(matrix[ey][i]);
			}
			for (int i = ey - 1; i >= sy + 1; i--) {
				ls.add(matrix[i][sx]);
			}
			sy++;
			sx++;
			ey--;
			ex--;
		}
		return ls;
	}

	public static void main(String[] args) {
		int[][] x = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (Integer i : printMatrix1(x))
			System.out.print(i + " ");

	}

}
