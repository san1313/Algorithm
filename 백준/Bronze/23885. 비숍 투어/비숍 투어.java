public class Main {
	public static void main(String[] args) throws Exception {
		long n = nextInt(), m = nextInt(), sx = nextInt(), sy = nextInt(), ex = nextInt(), ey = nextInt();
		if ((sx + sy) % 2 != (ex + ey) % 2) {
			System.out.println("NO");
			return;
		}
		if (sx == ex && sy == ey) {
			System.out.println("YES");
			return;
		}
		if (Math.abs(sx - ex) == Math.abs(sy - ey)) {
			System.out.println("YES");
			return;
		}
		long[][] lines1 = {{1, sx+sy}, {2, sx-sy}};
		long[][] lines2 = {{1, ex+ey}, {2, ex-ey}};
		for (long[] l1 : lines1) {
			for (long[] l2 : lines2) {
				if (l1[0] == l2[0]) continue;
				long sum = (l1[0]==1 ? l1[1] : l2[1]);
				long diff = (l1[0]==2 ? l1[1] : l2[1]);
				if ((sum+diff)%2!=0 || (sum-diff)%2!=0) continue;
				long x = (sum+diff)/2;
				long y = (sum-diff)/2;
				if (x>=1 && x<=n && y>=1 && y<=m) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}