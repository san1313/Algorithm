public class Main {
	public static void main(String[] args) throws Exception {
		double r = nextInt() / 255.0, g = nextInt() / 255.0, b = nextInt() / 255.0;
		double k = 1 - Math.max(r, Math.max(g, b));
		double c = k == 1 ? 0 : (1 - r - k) / (1 - k);
		double m = k == 1 ? 0 : (1 - g - k) / (1 - k);
		double y = k == 1 ? 0 : (1 - b - k) / (1 - k);
		System.out.println(c + " " + m + " " + y + " " + k);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}