import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int k = nextInt();
		for (int i = 0; i < k; i++) {
			int p = nextInt(), m = nextInt();
			int[] arr = new int[m + 1];
			for (int j = 0; j < p; j++) arr[nextInt()] = 1;
			System.out.println(p - Arrays.stream(arr).sum());
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}