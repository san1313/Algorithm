class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			System.out.println(readLine(a));
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine(int a) throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c, idx = 1;
		while ((c = System.in.read()) > 13) {
			if (idx++ != a) buf[len++] = (byte) c;
		}
		return new String(buf, 0, len);
	}
}