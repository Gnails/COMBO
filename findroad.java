import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

class findroad {
	static class node {
		int x, y, key, path;

		public node(int x, int y, int key, int path) {
			this.x = x;
			this.y = y;
			this.key = key;
			this.path = path;
		}

		node() {

		}
	}

	static TreeSet<Integer> ts = new TreeSet<Integer>();

	public static void bfs(int x, int y, int key, int path, int M, int N, char[][] ch) {
		Queue<node> q = new LinkedList<node>();
		node e = new node(x, y, key, path);
		int[][][] mp = new int[M][N][1025];
		int[][] dir = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };
		TreeSet<Integer> ts = new TreeSet<Integer>();
		q.offer(e);
		while (!q.isEmpty()) {
//			System.out.print(qi++);
			node tmp = q.poll();

			int tx = 0;
			int ty = 0;
			int tkey ;
			int tpath = tmp.path;
			for (int i = 0; i < 4; i++) {
				tx = tmp.x + dir[i][0];
				ty = tmp.y + dir[i][1];
				tkey = tmp.key;
				if (tx >= N || tx < 0 || ty >= M || ty < 0 || ch[ty][tx] == '0')
					continue;
				else if (ch[ty][tx] == '3') {
					ts.add(tmp.path + 1);
					System.out.print(tmp.path + 1);
					return;
				} else if (Character.isLowerCase(ch[ty][tx])) {
					tkey = tkey | 1 << (ch[ty][tx] - 'a');
				} else if (Character.isUpperCase(ch[ty][tx]) && ((tkey & (1 << (ch[ty][tx] - 'A'))) == 0)) {
//				else if (Character.isUpperCase(ch[ty][tx]) && (tmpkey&(1<<(ch[ty][tx]-'A')))==0) {
					continue;
				}
				if (mp[ty][tx][tkey] == 0) {
					mp[ty][tx][tkey] = 1;
					q.offer(new node(tx, ty, tkey, tmp.path + 1));
				}
			}
		}
		System.out.print(ts.first());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		char[][] ch = new char[M][N];
		for (int i = 0; i < M; i++) {
			ch[i] = sc.nextLine().toCharArray();
//			System.out.println(Arrays.deepToString(ch));
		}
		for (int i = 0; i < M; i++) {
			for (int k = 0; k < N; k++) {
				if (ch[i][k] == '2') {
					bfs(k, i, 0, 0, M, N, ch);
					return;
				}
			}
		}
	}
}