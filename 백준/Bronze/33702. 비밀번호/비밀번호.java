public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		System.out.println(t == 1 || t == 3 || t == 5 || t == 7 || t == 9 ? 8 : 0);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}