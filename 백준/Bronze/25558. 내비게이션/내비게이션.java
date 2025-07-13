public class Main {
    public static void main(String[] args) throws Exception {
        int n = nextInt(), sx = nextInt(), sy = nextInt(), ex = nextInt(), ey = nextInt(), r = 0;
		long min = Long.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			int m = nextInt(), prevX = sx, prevY = sy;
			long dis = 0;
			for (int j = 0; j < m; j++) {
				int x = nextInt(), y = nextInt();
				dis += calcDis(prevX, prevY, x, y);
				prevX = x;
				prevY = y;
			}
			dis += calcDis(prevX, prevY, ex, ey);
			if (min >= dis) {
				min = dis;
				r = i;
			}
		}
		System.out.println(r);
    }

	static long calcDis(long fromX, long fromY, long toX, long toY) {
		return Math.abs(fromX - toX) + Math.abs(fromY - toY);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}