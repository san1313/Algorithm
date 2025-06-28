public class Main {
	public static void main(String[] args) throws Exception {
		int[] a = new int[4];
		int[] b = new int[4];
		for (int i = 0; i < 4; i++) a[i] = nextInt();
		for (int i = 0; i < 4; i++) b[i] = nextInt();
		int ra = 0, rb = 0;
		for (int i = 0; i < 3; i++)
			for (int j = i + 1; j < 4; j++) ra += a[i] + a[j];
		for (int i = 0; i < 3; i++)
			for (int j = i + 1; j < 4; j++) rb += b[i] + b[j];
		System.out.println(ra == rb ? "Tie" : ra > rb ? "Gunnar" : "Emma");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}