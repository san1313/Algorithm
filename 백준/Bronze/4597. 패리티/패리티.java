public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			String s = readLine();
			if (s.equals("#")) break;
			int cnt = 0;
			StringBuilder sb = new StringBuilder();
			for (char c : s.toCharArray()) {
				if (c == 'e') {
					if (cnt % 2 == 0) sb.append(0);
					else sb.append(1);
				} else if (c == 'o') {
					if (cnt % 2 == 1) sb.append(0);
					else sb.append(1);
				} else {
					sb.append(c);
					if (c == '1') cnt++;
				}
			}
			System.out.println(sb);
		}
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}