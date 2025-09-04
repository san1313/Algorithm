class Main {
	public static void main(String[] args) throws Exception {
		int a = 0;
		for (int i = 0; i < 2; i++) a = a * 100 + System.in.read();
		System.out.print(a == 4049 ? 0 : a == 4149 ? 2 : 1);
	}
}