class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		boolean[] arr = new boolean[1001];
		for (int i = 2; i <= 32; i++)
			if (!arr[i])
				for (int j = i * i; j <= 1000; j += i) arr[j] = true;
		System.out.println(n);
		while (n-- > 0) {
			for (int i = 1; i <= 1000; i++) {
				if (!arr[i]) {
					arr[i] = true;
					System.out.print(i + " ");
					break;
				}
			}
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}