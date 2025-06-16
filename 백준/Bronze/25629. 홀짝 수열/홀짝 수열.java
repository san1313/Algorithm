public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), even = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			if (a % 2 == 0) even++;
			else odd++;
		}
		System.out.println(n % 2 == 1 ? (n / 2 + 1 == odd && n / 2 == even ? 1 : 0) : (even == odd ? 1 : 0));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

}