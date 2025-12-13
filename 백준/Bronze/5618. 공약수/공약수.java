public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a, b, c, min;
		if (n == 2) {
			a = nextInt();
			b = nextInt();
			min = Math.min(a, b);
			for (int i = 1; i <= min; i++) {
				if (a % i == 0 && b % i == 0) System.out.println(i);
			}
		} else {
			a = nextInt();
			b = nextInt();
			c = nextInt();
			min = Math.min(Math.min(a, b), c);
			for (int i = 1; i <= min; i++) {
				if (a % i == 0 && b % i == 0 && c % i == 0) System.out.println(i);
			}
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}