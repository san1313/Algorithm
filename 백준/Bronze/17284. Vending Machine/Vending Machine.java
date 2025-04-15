public class Main {
	public static void main(String[] args) throws Exception {
		int a,r = 0;
		while((a = nextInt()) != 0) {
			if (a == 1) r += 500;
			else if (a == 2) r += 800;
			else r += 1000;
		}
		System.out.println(5000 - r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
