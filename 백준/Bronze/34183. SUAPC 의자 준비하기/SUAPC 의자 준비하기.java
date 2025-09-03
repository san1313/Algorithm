class Main {
	public static void main(String[] args) throws Exception {
		int r = Math.max(0,nextInt() * 3 - nextInt()) * nextInt();
		System.out.println(r > 0 ? r + nextInt() : 0);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c != 58) r = r * 10 + c - 48;
		return r;
	}
}