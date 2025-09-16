import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			int v = nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			for (int j = 0; j < v; j++) {
				int a = nextInt();
				map.put(a, map.getOrDefault(a, 0) + 1);
			}
			List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
			list.sort((a, b) -> {
				if (b.getValue() == a.getValue()) {
					return a.getKey() - b.getKey();
				} else return b.getValue() - a.getValue();
			});
			System.out.println(list.get(0).getKey());
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}