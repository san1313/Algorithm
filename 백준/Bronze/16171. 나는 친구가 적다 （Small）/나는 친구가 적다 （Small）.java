public class Main {
	public static void main(String[] args) throws Exception {
		String s = readLine().replaceAll("[0-9]", "");
		System.out.println(s.contains(readLine()) ? 1 : 0);
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}