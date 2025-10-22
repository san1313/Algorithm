class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[][] a = {
		  {200, 210, 220},
		  {210, 220, 225},
		  {220, 225, 230},
		  {225, 230, 235},
		  {230, 235, 245},
		  {235, 245, 250}
		};

		int[][] g = {
		  {260, 265, 270},
		  {265, 270, 275},
		  {270, 275, 280},
		  {275, 280, 285},
		  {280, 285, 290},
		  {285, 290, 295},
		  {290, 295, 300}
		};

		for (int[] q : a) {
			System.out.print(f(n, q) + " ");
		}
		System.out.println();

		for (int[] q : g) {
			System.out.print(f(n, q) + " ");
		}
		System.out.println();

	}


	static int f(int level, int[] quest) {
		int base = 500;
		if (level < quest[0]) return 0;
		if (level >= quest[1]) base -= 200;
		if (level >= quest[2]) base -= 200;
		return base;
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}