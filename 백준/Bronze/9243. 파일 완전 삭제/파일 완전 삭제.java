class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		String a = readLine(), b = readLine();
		int l = a.length();
		for (int i = 0; i < l; i++) {
			if ((a.charAt(i) - 48 + n) % 2 != b.charAt(i) - 48) {
				System.out.print("Deletion failed");
				return;
			}
		}
		System.out.print("Deletion succeeded");
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1000];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}