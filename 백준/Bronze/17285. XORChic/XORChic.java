public class Main {
	public static void main(String[] args) throws Exception {
		int[] buf = new int[100];
		int len = 0, c = System.in.read(), key = c ^ 'C';
		do buf[len++] = (c ^ key);
		while ((c = System.in.read()) > 13);
		System.out.print(new String(buf, 0, len));
	}
}