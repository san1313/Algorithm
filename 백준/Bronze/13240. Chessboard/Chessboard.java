public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i % 2 == 0) sb.append(j % 2 == 0 ? "*" : ".");
				else sb.append(j % 2 == 0 ? "." : "*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}