public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt() - 1, first = nextInt(), min = first, max = first;
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			if (a < min) min = a;
			if (a > max) max = a;
		}
		System.out.println(first == min ? "ez" : first == max ? "hard" : "?");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}