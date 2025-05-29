public class Main {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 3; i++) {
			int c, prev = -1, st = 1, m = 1;
			while ((c = System.in.read()) > 47) {
				if (c == prev) st++;
				else {
					m = Math.max(m, st);
					st = 1;
				}
				prev = c;
			}
			System.out.println(Math.max(m, st));
		}
	}
}