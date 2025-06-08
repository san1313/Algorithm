public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[13];
		int idx = -1;
		for (int i = 0; i < 13; i++) {
			int c = System.in.read();
			if (c == '*') arr[(idx = i)] = 0;
			else arr[i] = c - 48;
		}
		int sum = 0;
		for (int i = 0; i < 13; i++) sum += i % 2 == 0 ? arr[i] : arr[i] * 3;
		for (int i = 0; i < 10; i++) {
			if ((sum + (idx % 2 == 0 ? i : i * 3)) % 10 == 0)System.out.println(i);
		}
	}
}