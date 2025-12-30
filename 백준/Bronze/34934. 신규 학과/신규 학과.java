public class Main {
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(readLine());
		while (n-- > 0) {
			String[] s = readLine().split(" ");
			if (s[1].equals("2026")) System.out.print(s[0]);
		}
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[20];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}