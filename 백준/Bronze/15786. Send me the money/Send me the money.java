public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt();
		String og = readLine();
		for (int i = 0; i < b; i++) {
			String c = readLine();
			int cur = 0;
			for (int j = 0; j < c.length(); j++) {
				if (cur == a) break;
				if (c.charAt(j) == og.charAt(cur)) cur++;
			}
			System.out.println(a==cur);
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