import java.io.BufferedReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		int d = Integer.parseInt(br.readLine()), e = Integer.parseInt(br.readLine());
		for (int i = 0; i < e; i++) {
			String t = br.readLine();
			int q = Integer.parseInt(br.readLine());
			d += t.equals("+") ? q : -q;
		}
		System.out.println(d);
	}
}