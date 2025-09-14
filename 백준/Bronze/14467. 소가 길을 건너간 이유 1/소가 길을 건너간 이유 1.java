import java.util.HashMap;
import java.util.Map;

class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int a = nextInt(), b = nextInt();
			if (map.containsKey(a) && map.get(a) != b) r++;
			map.put(a, b);
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}