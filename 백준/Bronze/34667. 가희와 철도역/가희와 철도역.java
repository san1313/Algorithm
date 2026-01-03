public class Main {
	public static void main(String[] args) throws Exception {
		byte[] buf = new byte[21];
		int len = 0, c;
		while ((c = System.in.read()) > 13) {
			if (len == 1) buf[len++] = buf[0];
			buf[len++] = (byte) c;
		}
		System.out.println(new String(buf, 0, len));
	}
}