public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		if (n < 4) {
			System.out.println(0);
			return;
		}
		int cnt = 0;
		for (int a = 1; a <= n - 3; a++) {
			for (int b = a + 1; b <= n - 2; b++) {
				for (int c = b + 1; c <= n - 1; c++) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}