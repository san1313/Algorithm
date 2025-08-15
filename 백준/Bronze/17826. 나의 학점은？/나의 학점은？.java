class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[50];
		for (int i = 0; i < 50; i++) arr[i] = nextInt();
		int n = nextInt(), r = 0;
		for (int i = 0; i < 50; i++) if (arr[i] == n) r = i;
		System.out.print(r < 5 ? "A+" : r < 15 ? "A0" : r < 30 ? "B+" : r < 35 ? "B0" : r < 45 ? "C+" : r < 48 ? "C0" : "F");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}