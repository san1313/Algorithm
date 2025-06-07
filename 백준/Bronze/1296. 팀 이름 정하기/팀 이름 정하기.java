public class Main {
	public static void main(String[] args) throws Exception {
		int[] baseName = calcLove(readLine());
		int n = nextInt(), max = -1;
		String res = "";
		while (n-- > 0) {
			String teamName = readLine();
			int probability = calcProbability(baseName, calcLove(teamName));
			if (probability > max || (probability == max && teamName.compareTo(res) < 0)) {
				max = probability;
				res = teamName;
			}
		}
		System.out.println(res);
	}

	static int[] calcLove(String str) {
		int[] arr = new int[4];
		for (char c : str.toCharArray()) {
			if (c == 'L') arr[0]++;
			else if (c == 'O') arr[1]++;
			else if (c == 'V') arr[2]++;
			else if (c == 'E') arr[3]++;
		}
		return arr;
	}

	static int calcProbability(int[] baseName, int[] teamName) {
		int[] tmp = new int[4];
		int res = 1;
		for (int i = 0; i < 4; i++) tmp[i] = baseName[i] + teamName[i];
		for (int i = 0; i < 3; i++)
			for (int j = i + 1; j < 4; j++) {
				res *= tmp[i] + tmp[j];
				res %= 100;
			}
		return res;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[20];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}