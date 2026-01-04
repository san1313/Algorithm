public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), k = nextInt(), max = -100;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = nextInt();
		for (int i = 0; i < n - k + 1; i++) {
			int tmp = 0;
			for (int j = i; j < i + k; j++) tmp += arr[j];
			max = Math.max(max, tmp);
		}
		System.out.println(max);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}