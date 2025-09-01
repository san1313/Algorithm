class Main {
	static class Clock {
		int h, m, s;

		Clock(int h, int m, int s) {
			this.h = h;
			this.m = m;
			this.s = s;
		}

		int getTime() {
			return h * 10000 + m * 100 + s;
		}

		void flowTime() {
			s++;
			if (s == 60) {
				m++;
				s = 0;
			}
			if (m == 60) {
				h++;
				m = 0;
			}
			if (h == 24) {
				h = 0;
			}
		}

		boolean isSameTime(int toH, int toM, int toS) {
			return getTime() == toH * 10000 + toM * 100 + toS;
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 3; i++) {
			Clock c = new Clock(nextInt(), nextInt(), nextInt());
			int toH = nextInt(), toM = nextInt(), toS = nextInt(), r = 0;
			while (true) {
				int time = c.getTime();
				if (time % 3 == 0) r++;
				if (c.isSameTime(toH, toM, toS)) break;
				c.flowTime();
			}
			System.out.println(r);
		}
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c != 58) r = r * 10 + c - 48;
		return r;
	}
}