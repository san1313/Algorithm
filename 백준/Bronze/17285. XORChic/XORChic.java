public class Main {
	public static void main(String[] args) throws Exception {
		char[] buf = new char[101];
		int len = 0, c, key;
		c = System.in.read();
		key = c ^ 'C';
		do {
			buf[len++] = (char) (c ^ key);
		} while ((c = System.in.read()) > 13);
		System.out.print(new String(buf, 0, len));
	}
}