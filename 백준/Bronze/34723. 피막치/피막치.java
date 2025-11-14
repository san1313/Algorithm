public class Main {
	public static void main(String[] args) throws Exception {
		int P = nextInt(), M = nextInt(), C = nextInt(), X = nextInt();
		int min = Integer.MAX_VALUE;
		for (int p = 1; p <= P; p++) {
			for (int m = 1; m <= M; m++) {
				for (int c = 1; c <= C; c++) {
					min = Math.min(min, Math.abs((p + m) * (m + c) - X));
				}
			}
		}
		System.out.println(min);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}