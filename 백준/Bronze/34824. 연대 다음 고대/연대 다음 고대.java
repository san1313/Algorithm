public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			String s = readLine();
			if (s.equals("yonsei")) {
				System.out.println("Yonsei Won!");
				return;
			}
			if (s.equals("korea")) {
				System.out.println("Yonsei Lost...");
				return;
			}
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + (c & 15);
		return r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[50];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}