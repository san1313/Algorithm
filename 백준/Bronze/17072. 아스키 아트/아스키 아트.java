public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) System.out.print(func(nextInt(), nextInt(), nextInt()));
			System.out.println();
		}
	}

	static String func(int r, int g, int b) {
		int intensity = r * 2126 + g * 7152 + b * 722;
		String res = "";
		if (intensity < 510000) res = "#";
		else if (intensity < 1020000) res = "o";
		else if (intensity < 1530000) res = "+";
		else if (intensity < 2040000) res = "-";
		else res = ".";
		return res;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
