public class Main {
	public static void main(String[] args) throws Exception {
		int x = nextInt(), y = nextInt(), z = nextInt(), n = nextInt();
		for (int c = 0; c < n; c++) {
			double x1 = 0, y1 = 0, x2 = x, y2 = y, z1 = c * z * 1.0 / n, z2 = (c + 1) * z * 1.0 / n;
			System.out.printf("%.8f %.8f %.8f %.8f %.8f %.8f\n",
			  x1, y1, z1, x2, y2, z2);
		}

	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}