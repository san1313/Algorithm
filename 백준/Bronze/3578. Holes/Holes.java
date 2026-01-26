public class Main {
	public static void main(String[] args) throws Exception {
		int h = nextInt();
		System.out.println(h == 0 ? 1 : h == 1 ? 0 : "4".repeat(h % 2) + "8".repeat(h / 2));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}