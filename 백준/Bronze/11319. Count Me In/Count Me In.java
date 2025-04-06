public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), c;
		int[] arr = {'A','E','I','O','U','a','e','i','o','u'};
		for (int i = 0; i < n; i++) {
			int a = 0, b = 0;
			while ((c = System.in.read()) > 13) {
				if (c == 32) continue;
				boolean flag = true;
				for (int ch : arr)
					if (c == ch) {
						flag = false;
						break;
					}
				if (flag) a++;
				else b++;
			}
			System.out.println(a + " " + b);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
