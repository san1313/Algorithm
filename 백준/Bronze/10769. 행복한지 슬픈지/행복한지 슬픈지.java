public class Main {
	public static void main(String[] args) throws Exception {
		String s = readLine();
		int a = s.replace(":-)", "").length();
		int b = s.replace(":-(", "").length();
		System.out.println(s.length() == a && s.length() == b ? "none" : a == b ? "unsure" : a < b ? "happy" : "sad");
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}