class Main {
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(readLine());
		while (n-- > 0) System.out.println(readLine().replaceAll("PO", "PHO"));
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}