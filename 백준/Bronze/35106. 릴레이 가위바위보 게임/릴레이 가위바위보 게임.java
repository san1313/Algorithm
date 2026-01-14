public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a = 0, b = 0;
		int[] arr = new int[4];
		for (int i = 0; i < 3 * n; i++) arr[nextInt()]++;
		for (int i = 1; i < 4; i++) {
			if (arr[i] - n == -1) a = i;
			if (arr[i] - n == 1) b = i;
		}
		System.out.print(a + "\n" + b);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}