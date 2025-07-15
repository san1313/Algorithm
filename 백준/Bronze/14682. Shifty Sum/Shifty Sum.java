public class Main {
    public static void main(String[] args) throws Exception {
        int a = nextInt(), b = nextInt(), r = a;
		for (int i = 0; i < b; i++) {
			a *= 10;
			r += a;
		}
		System.out.println(r);
    }

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}