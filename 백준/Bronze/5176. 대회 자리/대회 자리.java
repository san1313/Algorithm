public class Main {
	public static void main(String[] args) throws Exception {
		int k = nextInt();
		while (k-- > 0) {
			int p = nextInt(), m = nextInt(), r = 0;
			int[] arr = new int[m + 1];
			for (int j = 0; j < p; j++) r += arr[nextInt()]++ > 0 ? 0 : 1;
			System.out.println(p - r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}