public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), idx = -1, min1 = (int)1e9, min2 = min1;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nextInt();
			if (arr[i] == -1) idx = i;
		}
		for (int i = 0; i < idx; i++) min1 = Math.min(min1, arr[i]);
		for (int i = idx + 1; i < n; i++) min2 = Math.min(min2, arr[i]);
		System.out.println(min1 + min2);
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