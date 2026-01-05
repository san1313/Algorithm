public class Main {
	public static void main(String[] args) throws Exception {
		int c = nextInt(), h = nextInt(), r = 0;
		boolean[] arr = new boolean[86400];
		for (int i = 0; i < c; i++) {
			int s = nextInt() * 60 * 60 + nextInt() * 60 + nextInt();
			for (int j = s; j < s + 40; j++) arr[j] = true;
		}
		for (int i = 0; i < h; i++) {
			int s = nextInt() * 60 * 60 + nextInt() * 60 + nextInt();
			for (int j = s; j < s + 40; j++) arr[j] = true;
		}
		for (boolean b : arr) r += !b ? 1 : 0;
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}