import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a = 0, b = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
		for (int i = 0; i < n; i++) pq.add(nextInt());
		for (int i = 0; i < 42 && !pq.isEmpty(); i++) {
			int v = pq.poll();
			a += v;
			b += v > 249 ? 5 : v > 199 ? 4 : v > 139 ? 3 : v > 99 ? 2 : v > 59 ? 1 : 0;
		}
		System.out.println(a + " " + b);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}