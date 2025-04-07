public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = nextInt(), r = 0;
			for (int j = 2; j <= n; j++){
				int tmp = n;
				while (tmp % j == 0) {
					r++;
					tmp /= j;
				}
			}
			sb.append(r).append("\n");
		}
		System.out.println(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
