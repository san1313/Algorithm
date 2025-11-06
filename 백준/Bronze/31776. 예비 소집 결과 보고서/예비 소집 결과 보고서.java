class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			int cnt = 0, prev = 0;
			for (int j = 0; j < 3; j++) {
				int a = nextInt();
				if ((prev == -1 && a != -1) || (a != -1 && a < prev)) flag = true;
				if (a == -1) cnt++;
				prev = a;
			}
			r += !flag && cnt < 3 ? 1 : 0;
		}
		System.out.println(r);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33) ;
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}