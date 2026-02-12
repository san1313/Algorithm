import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Long l = null, r = null, u = null, d = null;
		while (n-- > 0) {
			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]), y = Integer.parseInt(s[1]);
			switch (s[2]) {
				case "L" -> l = l == null ? x : Math.min(l, x);
				case "R" -> r = r == null ? x : Math.max(r, x);
				case "U" -> u = u == null ? y : Math.max(u, y);
				case "D" -> d = d == null ? y : Math.min(d, y);
			}
		}
		if (l == null || r == null || u == null || d == null) {
			System.out.print("Infinity");
			return;
		}
		System.out.print((l - r - 1) * (d - u - 1));
	}
}