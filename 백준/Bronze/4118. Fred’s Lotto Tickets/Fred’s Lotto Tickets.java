import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		while(true) {
			int n = nextInt();
			if (n == 0) break;
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < 6 * n; i++) set.add(nextInt());
			System.out.println(set.size() == 49 ? "Yes" : "No");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}