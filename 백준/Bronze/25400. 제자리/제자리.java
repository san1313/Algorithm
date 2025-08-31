import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), c = 1, r = 0;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < n; i++) q.add(nextInt());
		while (!q.isEmpty()) {
			if (q.poll() == c) c++;
			else r++;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}