public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(nextLong() * 2);
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}