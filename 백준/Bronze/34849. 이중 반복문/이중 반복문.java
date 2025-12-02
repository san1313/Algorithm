public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(nextInt() > 10000 ? "Time limit exceeded" : "Accepted");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + (c & 15);
		return r;
	}
}