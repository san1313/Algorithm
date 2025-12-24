public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(nextInt() > 5 ? "Success!" : "Oh My God!");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}