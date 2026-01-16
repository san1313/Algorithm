import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		int x = nextInt(), y = nextInt(), a = nextInt(), b = nextInt(), max = Math.max(a, b) + x * y, r = -1;
		List<Integer> list = new ArrayList<>();
		while (a <= max) {
			list.add(a);
			a += x;
		}
		while (b <= max) {
			if (list.contains(b)) {
				r = b;
				break;
			}
			b += y;
		}
		System.out.print(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}