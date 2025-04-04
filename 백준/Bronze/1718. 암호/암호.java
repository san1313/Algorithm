public class Main {
	public static void main(String[] args) throws Exception {
		String s = readLine(), c = readLine();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) == ' ' ? " " : (char)((s.charAt(i) - c.charAt(i % c.length()) + 25) % 26 + 97));
		}
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}
