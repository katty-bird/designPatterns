package designPatterns;
import java.util.ArrayList;

public class Store implements Observer {
	private ArrayList<ShoppingCart> carts = new ArrayList<ShoppingCart>();
	private String brand;
	
	public Store (String brand) {
		this.brand=brand;
	}

	public ArrayList<ShoppingCart> getCarts() {
		return carts;
	}
}
