class Main {
	public static void main(String[] args) throws Exception {
		int k = nextInt();
		char[][] arr = {{'G', '.', '.', '.'}, {'.', 'I', '.', 'T'}, {'.', '.', 'S', '.'}};
		StringBuilder sb = new StringBuilder();
		for (char[] chars : arr) {
			for (int i = 0; i < k; i++) {
				for (char c : chars) {
					for (int j = 0; j < k; j++) {
						sb.append(c);
					}
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}