class Main {
	public static void main(String[] args) throws Exception {
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) a[i] = System.in.read();
		System.out.println(a[0] == 40 && a[1] == 49 ? 0 : a[0] == 41 && a[1] == 49 ? 2 : 1);
	}
}