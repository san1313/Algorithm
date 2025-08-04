public class Main {
	public static void main(String[] args) throws Exception {
		int c, r = 0, prev = 0;
		while ((c = System.in.read()) > 13) {
			if (prev != 0 && prev != c) break;
			r++;
			prev = c;
		}
		System.out.println(r);
	}
}