class Main {
	public static void main(String[] args) throws Exception {
		a:while (true) {
			int c, r = 0;
			boolean[] arr = new boolean[123];
			while ((c = System.in.read()) > 13) {
				if (c == '#') break a;
				arr[c] = true;
			}
			for (int i = 'A'; i <= 'Z'; i++) {
				if (arr[i] || arr[i + 32]) r++;
			}
			System.out.println(r);
		}
	}
}