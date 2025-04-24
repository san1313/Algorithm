public class Main {
	public static void main(String[] args) throws Exception {
		String[] arr = readLine().split(" ");
		String b = readLine();
		int r = 0;
		for (String a : arr) if (!a.equals(b) && a.startsWith(b)) r++;
		System.out.println(r);
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 20];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}