public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(Math.max(0, 10 + 2 * (25 - nextInt() + nextInt())));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}