public class Main {
	public static void main(String[] args) throws Exception {
		int a = 1 + nextInt() * 7;
		System.out.printf("%d %d", 2024 + (a - 1) / 12, a % 12 == 0 ? 12 : a % 12);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}