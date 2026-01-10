public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), c;
		while (n-- > 0) {
			int r = 0;
			String s = readLine();
			for (char ch : s.toCharArray()) r += ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? 1 : 0;
			System.out.printf("The number of vowels in %s is %d.\n", s, r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}