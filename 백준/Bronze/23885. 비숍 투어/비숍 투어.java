public class Main {
	public static void main(String[] args) throws Exception {
		long n = nextInt(), m = nextInt(), sx = nextInt(), sy = nextInt(), ex = nextInt(), ey = nextInt();
		if ((sx + sy) % 2 != (ex + ey) % 2) {
			System.out.println("NO");
			return;
		}
		if (Math.abs(sx - ex) == Math.abs(sy - ey)) {
			System.out.println("YES");
			return;
		}
		long[] sums = {sx + sy, sx - sy};
		long[] sums2 = {ex + ey, ex - ey};
		for (long a : sums) {
			for (long b : sums2) {
				long x = (a + b) / 2;
				long y = (a - b) / 2;
				if ((a + b) % 2 == 0 && (a - b) % 2 == 0) { // 정수 좌표
					if (x >= 1 && x <= n && y >= 1 && y <= m) {
						System.out.println("YES");
						return;
					}
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