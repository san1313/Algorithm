public class Main {
	public static void main(String[] args) throws Exception {
		readLine();
		String a = readLine(), b = readLine();
		System.out.println(a.length() < b.length() ? a : a.length() > b.length() ? b : a.compareTo(b) < 0 ? a : b);
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) {
			if (c == 32) continue;
			buf[len++] = (byte) c;
		}
		return new String(buf, 0, len);
	}
}