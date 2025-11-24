public class Main {
	public static void main(String[] args) throws Exception {
		int m = nextInt(), d = nextInt();
		System.out.println((d - 1) / m + 1);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}