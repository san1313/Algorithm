class Main {
	public static void main(String[] args) throws Exception {
		String[] s = readLine().split("\\(");
		System.out.println(s[0].trim());
		if(s.length > 1) {
			System.out.println(s[1].replace(")", ""));
		} else {
			System.out.println("-");
		}
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}