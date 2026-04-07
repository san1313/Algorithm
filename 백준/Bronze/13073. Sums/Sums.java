public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = nextInt();
			int a = n, b = n, c = n, d = 0, e = 0, f = 0, j = 1;
			while (a != 0 || b != 0 || c != 0) {
				if (a > 0) {
					d += j;
					a--;
				}
				if (j % 2 != 0 && b > 0) {
					e += j;
					b--;
				}
				if (j % 2 == 0 && c > 0) {
					f += j;
					c--;
				}
				j++;
			}
			sb.append(d).append(" ").append(e).append(" ").append(f).append("\n");
		}
		System.out.println(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}