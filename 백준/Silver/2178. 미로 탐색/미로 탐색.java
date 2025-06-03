import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		int[][] arr = new int[n][m];
		int[][] dis = new int[n][m];
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) arr[i][j] = System.in.read();
			System.in.read();
		}
		Queue<int[]> q = new LinkedList<>();
		dis[0][0] = 1;
		arr[0][0] = 48;
		q.add(new int[]{0, 0});
		while (!q.isEmpty()) {
			int[] p = q.poll();
			for (int i = 0; i < 4; i++) {
				int x = p[0] + dx[i], y = p[1] + dy[i];
				if (x < 0 || x >= n || y < 0 || y >= m || arr[x][y] == 48) continue;
				q.add(new int[]{x, y});
				dis[x][y] = dis[p[0]][p[1]] + 1;
				arr[x][y] = 48;
			}
		}
		System.out.print(dis[n - 1][m - 1]);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}