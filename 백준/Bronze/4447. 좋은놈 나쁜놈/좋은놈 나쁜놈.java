class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			String s = readLine();
			int a = s.toLowerCase().replace("g", "").length(), b = s.toLowerCase().replace("b", "").length();
			System.out.printf("%s is %s\n", s, a < b ? "GOOD" : a > b ? "A BADDY" : "NEUTRAL");
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