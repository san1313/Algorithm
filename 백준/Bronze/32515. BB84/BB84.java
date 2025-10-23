class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		String a = readLine(), b = readLine(), c = readLine(), d = readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (a.charAt(i) == c.charAt(i)) {
				int B = b.charAt(i), D = d.charAt(i);
				if (B != D) {
					System.out.println("htg!");
					return;
				}
				sb.append(B - 48);
			}
		}
		System.out.println(sb);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[200000];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}