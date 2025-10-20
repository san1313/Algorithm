class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		boolean[] arr = new boolean[101];
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			if (arr[a]) r++;
			else arr[a] = true;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}