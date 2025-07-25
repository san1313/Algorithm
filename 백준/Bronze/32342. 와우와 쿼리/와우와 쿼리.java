public class Main {
	public static void main(String[] args) throws Exception {
		int n = 0, a;
		while ((a = System.in.read()) > 47) n = n * 10 + a - 48;
		while (n-- > 0) {
			int c, r = 0, prev = 79, st = 0;
			while ((c = System.in.read()) > 13) {
				st = c != prev ? st + 1 : c == 'W' ? 1 : 0;
				if (st == 3) {
					r++;
					st = 1;
				}
				prev = c;
			}
			System.out.println(r);
		}
	}
}