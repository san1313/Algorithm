public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), dis = -1, r = 0, c = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++)
				if (nextInt() == 0) {
					int res = i + Math.abs((m + 1) / 2 - j);
					if (dis == -1 || dis > res) {
						r = i;
						c = j;
						dis = res;
					}
				}
		System.out.print(dis != -1 ? r + " " + c : -1);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}