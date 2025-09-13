class Main {
	public static void main(String[] args) throws Exception {
		String s = readLine();
		int a = 0, b = 0, l = s.length() - 2;
		for (int i = 0; i < l; i++) {
			String tmp = s.substring(i, i + 3);
			if (tmp.equals("JOI"))a++;
			else if (tmp.equals("IOI"))b++;
		}
		System.out.println(a + "\n" + b);
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}