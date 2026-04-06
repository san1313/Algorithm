public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), sx = nextInt(), sy = nextInt(), ex = nextInt(), ey = nextInt();
		if ((sx + sy) % 2 == (ex + ey) % 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}