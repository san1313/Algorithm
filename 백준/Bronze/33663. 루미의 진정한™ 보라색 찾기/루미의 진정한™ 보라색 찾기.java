public class Main {
	public static void main(String[] args) throws Exception {
		int hl = nextInt(), hh = nextInt(), sl = nextInt(), sh = nextInt(), vl = nextInt(), vh = nextInt(), r = nextInt(), g = nextInt(), b = nextInt();
		int M = Math.max(Math.max(r, g), b), m = Math.min(Math.min(r, g), b);
		double s = 255 * ((M - m) * 1.0 / M);
		double h;
		if (M == r) h = (60.0 * (g - b)) / (M - m);
		else if (M == g) h = (60.0 * (b - r)) / (M - m) + 120;
		else h = (60.0 * (r - g)) / (M - m) + 240;
		if (h < 0) h += 360;
		System.out.print(h >= hl && h <= hh && s >= sl && s <= sh && M >= vl && M <= vh ? "Lumi will like it." : "Lumi will not like it.");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}