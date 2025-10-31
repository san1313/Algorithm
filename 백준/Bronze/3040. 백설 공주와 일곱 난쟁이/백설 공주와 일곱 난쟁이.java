class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[9];
		int sum = -100, r1 = 0, r2 = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (arr[i] + arr[j] == sum) {
					r1 = i;
					r2 = j;
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			if (i != r1 && i != r2) System.out.println(arr[i]);
		}
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}