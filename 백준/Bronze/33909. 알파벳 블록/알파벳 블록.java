public class Main {
	public static void main(String[] args) throws Exception {
		int s = nextInt(), c = nextInt(), o = nextInt(), n = nextInt();
		int S = s + n, C = c + o * 2;
		System.out.println(Math.min(S / 3, C / 6));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}