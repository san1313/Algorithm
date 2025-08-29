class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		long r = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = nextInt();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) r += Math.abs(arr[i] - arr[j]);
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}