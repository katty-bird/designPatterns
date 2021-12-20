package designPatterns;

public class Test {
	public static void main(String[] args) {
		
		Store edeka1   = new Store("Edeka");
		Store edeka2   = new Store("Edeka");
		Store lidl    = new Store("Lidl");
		Store aldi    = new Store("Aldi");
		Store kaufhof = new Store("Kaufhof");
		Store penny   = new Store("Penny");
		Store bauhaus = new Store("Bauhaus");
		
		ShoppingCartList listCarts = new ShoppingCartList();
		
		listCarts.registerObserver(edeka1);
		listCarts.registerObserver(edeka2);
		listCarts.registerObserver(lidl);
		listCarts.registerObserver(aldi);
		listCarts.registerObserver(kaufhof);
		listCarts.registerObserver(penny);
		listCarts.registerObserver(bauhaus);
		
		listCarts.addCart(new ShoppingCart(1, "Leipziger Strasse", "Lidl"));
		
	}

}
