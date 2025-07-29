public class Main {
	public static void main(String[] args) throws Exception {
		int c, t = 0;
		while ((c = System.in.read()) > 47) t = t * 10 + c - 48;
		for (int i = 1; i <= t; i++) {
			String[] s = readLine().split(" ");
			long x = Long.parseLong(s[1]), r = 0, l = s[0].length();
			for (int j = 0; j < l; j++) r = (r * 10 + s[0].charAt(j) - 48) % x;
			System.out.printf("Case %d: %s\n", i, r);
		}
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1000010];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}