import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		int s1 = nextInt(), s2 = nextInt(), s3 = nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int k = 1; k <= s3; k++) {
					int n = i + j + k;
					map.put(n, map.getOrDefault(n, 0) + 1);
				}
			}
		}
		System.out.println(map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).findFirst().get().getKey());
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}