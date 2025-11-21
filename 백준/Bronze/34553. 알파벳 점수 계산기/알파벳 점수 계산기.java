public class Main {
	public static void main(String[] args) throws Exception {
		int c, r = 1, prev = -1, st = 1;
		while ((c = System.in.read()) > 13) {
			if (prev != -1) {
				if (prev < c) st++;
				else st = 1;
				r += st;
			}
			prev = c;
		}
		System.out.println(r);
	}
}