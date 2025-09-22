class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(nextDouble() - 0.3);
	}

	static double nextDouble() throws Exception {
		double c, r = 0, div = 1;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		if (c == 46) while ((c = System.in.read()) > 47) r += (c - 48) / (div *= 10);
		return neg ? -r : r;
	}
}