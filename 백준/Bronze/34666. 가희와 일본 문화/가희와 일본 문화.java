public class Main {
	public static void main(String[] args) throws Exception {
		int q = nextInt();
		for (int i = 0; i < q; i++) {
			int a = nextInt(), b = nextInt(), c = nextInt(), d = nextInt();
			System.out.println(check1(a) && check2(d) && check3(a, b, c) ? "YES" : "NO");
		}
	}

	static boolean check1(int a){
		return a == 1 || a == 2;
	}

	static boolean check2(int d) {
		return d >= 50;
	}

	static boolean check3(int a, int b, int c) {
		int[] arr = {0, 100, 90, 95, 90, 80};
		if (b * 3 < arr[a] && c * 3 < arr[a]) return true;
		if (b < 22 || c < 22) return true;
		return false;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}