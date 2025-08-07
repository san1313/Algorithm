public class Main {
	public static void main(String[] args) throws Exception {
		String s = readLine();
		String[] arr = readLine().split(" ");
		for (String str : arr) s = s.replace(str, str.toLowerCase());
		System.out.println(s);
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 17];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}