public class Main {
	public static void main(String[] args) throws Exception {
		String s = next();
		int n = Integer.parseInt(next()), cur = 0;
		while (n-- > 0) {
			char t = next().charAt(0);
			int len = t == 'c' ? 2 : t == 'i' ? 8 : 16;
			System.out.println(Long.parseLong(s.substring(cur, cur += len), 16));
		}
	}

	static String next() throws Exception {
		byte[] buf = new byte[10];
		int len = 0, c;
		while ((c = System.in.read()) > 32) {
			if (len >= buf.length) {
				byte[] tmp = new byte[buf.length << 1];
				System.arraycopy(buf, 0, tmp, 0, buf.length);
				buf = tmp;
			}
			buf[len++] = (byte) c;
		}
		return new String(buf, 0, len);
	}
}