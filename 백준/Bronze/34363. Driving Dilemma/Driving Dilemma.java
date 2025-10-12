class Main {
	public static void main(String[] args) throws Exception {
		double s = nextDouble(), d = nextDouble(), t = nextDouble(), sp = s * 5280.0 / 3600.0;
		double dis = sp * t;
		System.out.println(dis >= d ? "MADE IT" : "FAILED TEST");
	}

	static double nextDouble() throws Exception {
		double c, r = 0, div = 1;
		while ((c = System.in.read()) < 33) ;
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		if (c == 46) while ((c = System.in.read()) > 47) r += (c - 48) / (div *= 10);
		return neg ? -r : r;
	}
}