public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		while (n != 1) {
			System.out.print(n + " ");
			if (n % 2 == 0) n /= 2;
			else n = 3 * n + 1;
		}
		System.out.print(1);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}