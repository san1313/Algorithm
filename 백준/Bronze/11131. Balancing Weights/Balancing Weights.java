public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			int n = nextInt(), a = 0;
			for (int j = 0; j < n; j++) a += nextInt();
			System.out.println(a == 0 ? "Equilibrium" : a < 0 ? "Left" : "Right");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}