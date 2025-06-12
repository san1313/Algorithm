public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), r = 0, min = 100000000;
		for (int i = (int) Math.ceil(Math.sqrt(n)); i * i <= m; i++) {
			min = Math.min(min, i * i);
			r += i * i;
		}
		System.out.println(r == 0 ? -1 : r + " " + min);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}