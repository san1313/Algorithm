public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) arr[i] = nextInt();
		int hp = nextInt(), r = -1;
		while (hp > 0) {
			r++;
			if (r == 0) {
				hp -= arr[1] + arr[3] + arr[5];
			} else {
				if (r % arr[0] == 0) hp -= arr[1];
				if (r % arr[2] == 0) hp -= arr[3];
				if (r % arr[4] == 0) hp -= arr[5];
			}
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}