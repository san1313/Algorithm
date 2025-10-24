class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		String a = readLine(), b = readLine();
		StringBuilder sb = new StringBuilder();
		if (n % 2 == 1) {
			for (char c : a.toCharArray()) sb.append(c == 48 ? 1 : 0);
		} else sb.append(a);
		System.out.println(sb.toString().equals(b) ? "Deletion succeeded" : "Deletion failed");
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