public class Main {
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(readLine());
		a:while (n-- > 0) {
			readLine();
			String[] arr = readLine().split(" \\+ ");
			int r = 0, flag = 0;
			for (String s : arr) {
				if (s.equals("!")) flag = 1;
				r += flag == 1 ? 0 : Integer.parseInt(s);
				if (r > 9) flag = 1;
				if (flag == 1) {
					System.out.println("!");
					continue a;
				}
			}
			System.out.println(r);
		}
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}