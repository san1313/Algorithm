class Main {
	public static void main(String[] args) throws Exception {
		System.out.print("I love DGU\n".repeat(nextInt()));
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}