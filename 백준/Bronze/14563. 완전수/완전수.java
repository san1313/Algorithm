public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			int n = nextInt(), s = 0;
			for (int j = 1; j < n; j++) s += n % j == 0 ? j : 0;
			System.out.println(n == s ? "Perfect" : n > s ? "Deficient" : "Abundant");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}