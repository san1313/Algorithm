import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), r = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < m; i++) list.add(nextInt() * 100 + nextInt() * 10 + nextInt());
		for (Integer i : list) {
			if (list.contains(i - 100) && list.contains(i + 100) && list.contains(i - 10) && list.contains(i + 10) && list.contains(i - 1) && list.contains(i + 1)) r++;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}