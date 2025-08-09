public class Main {
	public static void main(String[] args) throws Exception {
		int c, prev = 0, r = 0;
		while ((c = System.in.read()) > 13) {
			r += c == prev ? 5 : 10;
			prev = c;
		}
		System.out.print(r);
	}
}