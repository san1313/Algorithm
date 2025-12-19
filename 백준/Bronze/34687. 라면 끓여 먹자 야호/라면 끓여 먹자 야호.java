public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt() * 81, b = nextInt();
		System.out.println(a / 100.0 <= b ? "yaho" : "no");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}