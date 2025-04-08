import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt(), r = 0;
		for (int i = 0; i < t; i++) {
			int a = Math.max(nextInt(), nextInt());
			int[] arr = new int[5];
			for (int j = 0; j < 5; j++) arr[j] = nextInt();
			Arrays.sort(arr);
			r = Math.max(r, a + arr[3] + arr[4]);
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
