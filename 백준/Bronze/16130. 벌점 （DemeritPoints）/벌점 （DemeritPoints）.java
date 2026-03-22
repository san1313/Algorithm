public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), c;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int r = 0, chk = 0, x = 0, flag = 0;
			while ((c = System.in.read()) > 13) {
				x += c - (c < 58 ? '0' : 'A' - 10);
				int q = x / 10;
				if ((chk & 1 << q) == 0) {
					if (q < 4) r += q;
					else if (q == 4) flag = 1;
					else flag = 2;
				}
				chk |= 1 << q;
			}
			sb.append(r).append(flag == 0 ? "" : flag == 1 ? "(weapon)" : "(09)").append("\n");
		}
		System.out.print(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}