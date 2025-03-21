public class Main {
	public static void main(String[] args) throws Exception {
		int c, cur = 0, i = 0;
		int[] arr = {'U', 'A', 'P', 'C'};
		int[] arr2 = new int[4];
		while ((c = System.in.read()) > 13) arr2[i++] = c;
		for (int j = 0; j < 4; j++) {
			if (arr[j] == arr2[cur]) cur++;
			else System.out.print((char) arr[j]);
		}
	}
}