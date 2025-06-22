public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			String[] s = readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[2]);
			int c = Integer.parseInt(s[4]);
			boolean r;
			if (s[1].equals("+")) r = a + b == c;
			else r = a - b == c;
			System.out.printf("Case %d: %s\n", i + 1, r ? "YES" : "NO");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}