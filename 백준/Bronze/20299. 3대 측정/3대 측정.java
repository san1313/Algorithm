import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), k = nextInt(), l = nextInt(), r = 0;
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int sum = 0;
			boolean flag = true;
			int[] arr = new int[3];
			for (int j = 0; j < 3; j++) {
				arr[j] = nextInt();
				sum += arr[j];
				if (arr[j] < l) flag = false;
			}
			if (sum < k) flag = false;
			if (flag) {
				r++;
				for (int j = 0; j < 3; j++) {
					list.add(arr[j]);
				}
			}
		}
		sb.append(r).append("\n");
		for (Integer i : list) sb.append(i).append(" ");
		System.out.println(sb);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}