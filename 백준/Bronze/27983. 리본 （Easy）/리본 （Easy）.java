public class Main {
	public static void main(String[] args) throws Exception {
		int N = (int) nextLong();
		long[] X = new long[N];
		long[] L = new long[N];
		char[] C = new char[N];
		for (int i = 0; i < N; i++) X[i] = nextLong();
		for (int i = 0; i < N; i++) L[i] = nextLong();
		String colors = readLine();
		for (int i = 0; i < N; i++) C[i] = colors.charAt(i * 2);
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (C[i] != C[j] && Math.abs(X[i] - X[j]) <= L[i] + L[j]) {
					System.out.println("YES");
					System.out.println((i + 1) + " " + (j + 1));
					return;
				}
			}
		}
		System.out.println("NO");
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}