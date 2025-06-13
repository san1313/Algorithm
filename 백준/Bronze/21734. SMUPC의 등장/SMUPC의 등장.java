import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int c;
		while ((c = System.in.read()) != -1) {
			int sum = 0, tmp = c;
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			int[] arr = new int[sum];
			Arrays.fill(arr, c);
			System.out.println(new String(arr, 0, sum));
		}
	}
}