public class Main {
	public static void main(String[] args) throws Exception {
		int c;
		a:while (true) {
			boolean[] arr = new boolean[26];
			while ((c = System.in.read()) > 13) {
				if (c == 42) break a;
				if (c == 32) continue;
				arr[c - 97] = true;
			}
			for (boolean b : arr) {
				if (!b) {
					System.out.println("N");
					continue a;
				}
			}
			System.out.println("Y");
		}
	}
}
