public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), a = nextInt(), d = nextInt(), s1 = nextInt(), s2 = nextInt();
		boolean res = false;
		if (s1 != n) res = true;
		else if (n % 2 == 0 && d == 0) res = true;
		else if (n % 2 == 1 && d == 1) res = true;
		System.out.println(res ? "NO..." : "YES!");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	}
