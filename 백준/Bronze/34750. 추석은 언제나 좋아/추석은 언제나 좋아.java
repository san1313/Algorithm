public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt();
		int r = (int)(a >= 1000000 ? a * 0.2 : a >= 500000 ? a * 0.15 : a >= 100000 ? a * 0.1 : a * 0.05);
		System.out.println(r + " " + (a - r));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}