public class Main {
	public static void main(String[] args) throws Exception {
		String[] s = readLine().split(" ");
		System.out.println(Integer.parseInt(new StringBuilder().append(Integer.parseInt(s[0]) + Integer.parseInt(s[1])).reverse().toString()));
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new StringBuilder(new String(buf, 0, len)).reverse().toString();
	}
}