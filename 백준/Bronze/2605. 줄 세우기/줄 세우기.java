import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) list.add(list.size() - nextInt(), i);
		for (Integer i : list) System.out.print(i + " ");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}