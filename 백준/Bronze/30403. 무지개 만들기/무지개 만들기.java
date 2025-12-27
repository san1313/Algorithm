public class Main {
	public static void main(String[] args) throws Exception {
		int a = 0, b = 0, r = 19022146;
		readLine();
		String s = readLine();
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) a |= 1 << (c - 'A');
			else b |= 1 << (c - 'a');
		}
		System.out.print((r & a) == r && (r & b) == r ? "YeS" : (r & a) == r ? "YES" : (r & b) == r ? "yes" : "NO!");
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[100];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}