public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), r = 0;
		for (int i = 1; i <= b; i += 2) {
			if (i >= a || i + 1 >= a) r++;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}