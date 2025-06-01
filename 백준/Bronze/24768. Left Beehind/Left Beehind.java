public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			int a = nextInt(), b = nextInt();
			String s = "";
			if (a == 0 && b == 0) break;
			if (a + b == 13) s = "Never speak again.";
			else if (a > b) s = "To the convention.";
			else if (a < b) s = "Left beehind.";
			else s = "Undecided.";
			System.out.println(s);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}