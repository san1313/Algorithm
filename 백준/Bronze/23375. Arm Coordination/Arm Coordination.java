public class Main {
	public static void main(String[] args) throws Exception {
		int x = nextInt(), y = nextInt(), r = nextInt();
		System.out.println((x - r) + " " + (y - r));
		System.out.println((x - r) + " " + (y + r));
		System.out.println((x + r) + " " + (y + r));
		System.out.println((x + r) + " " + (y - r));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}