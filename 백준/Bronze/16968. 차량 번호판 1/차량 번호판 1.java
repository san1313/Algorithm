public class Main {
	public static void main(String[] args) throws Exception {
		int c, p = -1, r = 1;
		while ((c = System.in.read()) > 98) {
			if (c == 100) {
				if (p == 1) r *= 9;
				else r *= 10;
				p = 1;
			}else {
				if (p == 0)r *= 25;
				else r *= 26;
				p = 0;
			}
		}
		System.out.println(r);
	}
}