public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), c = nextInt(), d = nextInt(), e = nextInt(), f = nextInt();
		int A = Math.min(a, java.lang.Math.min(d, e)), B = Math.min(b, java.lang.Math.min(c, f));
		System.out.println(A == B ? A + B : Math.min(A, B) * 2 + 1);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}