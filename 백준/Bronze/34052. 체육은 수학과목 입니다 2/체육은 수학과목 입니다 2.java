public class Main {
    public static void main(String[] args) throws Exception {
        int a = 0;
		for (int i = 0; i < 4; i++) a += nextInt();
		System.out.println(a <= 1500 ? "Yes" : "No");
    }

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}