public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("n e\n- -----------\n0 1\n1 2\n2 2.5");
		for (int i = 3; i < 10; i++) {
			System.out.printf("%d %.9f\n", i, calc(i));
		}
	}

	static double calc(int n) {
		double e = 0;
		for (int i = 0; i <= n; i++) {
			e += 1.0 / fact(i);
		}
		return e;
	}

	static int fact(int num) {
		if (num == 0 || num == 1) return 1;
		return num * fact(num - 1);
	}
}