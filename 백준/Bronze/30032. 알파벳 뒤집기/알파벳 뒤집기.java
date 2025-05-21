public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), d = nextInt(), c;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				while ((c = System.in.read()) < 32) ;
				if (d == 1) c = c == 'd' ? 'q' : c == 'b' ? 'p' : c == 'q' ? 'd' : 'b';
				else c = c == 'd' ? 'b' : c == 'b' ? 'd' : c == 'q' ? 'p' : 'q';
				System.out.print((char) c);
			}
			System.out.println();
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}