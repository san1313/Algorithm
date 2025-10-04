class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(readLine());
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[50];
		int len = 0, c, t = 1;
		while ((c = System.in.read()) > 13) {
			if (c == 45) t = 1;
			else if (t == 1) {
				buf[len++] = (byte) c;
				t = 0;
			}
		}
		return new String(buf, 0, len);
	}
}