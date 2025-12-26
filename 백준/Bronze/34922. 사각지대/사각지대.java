public class Main {
	public static void main(String[] args) throws Exception {
		int w = nextInt(), h = nextInt(), r = nextInt();
		double a = r * r * Math.PI / 4;
		System.out.println(w * h - a);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}