public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			String a = readLine(), b = readLine();
			System.out.printf("Case %d: %s, %s\n", i + 1, b, a);
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