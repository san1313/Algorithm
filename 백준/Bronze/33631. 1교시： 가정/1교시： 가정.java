class Main {
	enum Ingredients {
		FLOUR, CHOCOLATE, EGG, BUTTER
	}

	static class Cookie {
		int[] ingredients;
		int[] ingredientRequirements;
		int madeCookies = 0;

		Cookie(int[] ingredients, int[] ingredientRequirements) {
			this.ingredients = ingredients;
			this.ingredientRequirements = ingredientRequirements;
		}

		boolean canMakeCookie(int quantity) {
			for (int i = 0; i < ingredients.length; i++) {
				if (ingredientRequirements[i] * quantity > ingredients[i]) return false;
			}
			return true;
		}

		void makeCookie(int quantity) {
			if (canMakeCookie(quantity)) {
				madeCookies += quantity;
				for (int i = 0; i < ingredients.length; i++) {
					ingredients[i] -= ingredientRequirements[i] * quantity;
				}
				System.out.println(madeCookies);
			} else {
				System.out.println("Hello, siumii");
			}
		}

		void addIngredient(Ingredients ingredient, int quantity) {
			ingredients[ingredient.ordinal()] += quantity;
			System.out.println(ingredients[ingredient.ordinal()]);
		}
	}

	public static void main(String[] args) throws Exception {
		int len = Ingredients.values().length;
		int[] ingredients = new int[len];
		int[] ingredientRequirements = new int[len];
		for (int i = 0; i < len; i++) ingredients[i] = nextInt();
		for (int i = 0; i < len; i++) ingredientRequirements[i] = nextInt();
		Cookie cookie = new Cookie(ingredients, ingredientRequirements);
		int query = nextInt();
		for (int i = 0; i < query; i++) {
			int cmd = nextInt(), quantity = nextInt();
			switch (cmd) {
				case 1 -> cookie.makeCookie(quantity);
				case 2 -> cookie.addIngredient(Ingredients.FLOUR, quantity);
				case 3 -> cookie.addIngredient(Ingredients.CHOCOLATE, quantity);
				case 4 -> cookie.addIngredient(Ingredients.EGG, quantity);
				case 5 -> cookie.addIngredient(Ingredients.BUTTER, quantity);
			}
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}