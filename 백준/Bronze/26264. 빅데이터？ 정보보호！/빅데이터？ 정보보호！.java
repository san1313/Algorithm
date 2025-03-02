public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		String s = readLine().replace("security", "!").replace("bigdata", "?");
		int len1 = s.replace("!", "").length();
		int len2 = s.replace("?", "").length();
		System.out.println(len1 < len2 ? "security!" : len1 > len2 ? "bigdata?" : "bigdata? security!");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 20];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}