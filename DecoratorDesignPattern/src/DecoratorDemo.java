


public class DecoratorDemo {
	public static void main(String[] args) {
	
	HotDrink plainCoffee = new Coffee();
	System.out.println(plainCoffee.getHotDrinkDescription()+", Price: "+plainCoffee.getPrice()+" Cents");
	
	HotDrink plainTea = new Tea();
	System.out.println(plainTea.getHotDrinkDescription()+", Price: "+plainTea.getPrice()+" Cents");
	
	HotDrink creamCoffee = new CreamDecorator(new Coffee());
	System.out.println(creamCoffee.getHotDrinkDescription()+", Price: "+creamCoffee.getPrice()+" Cents");
	
	HotDrink sugarCoffee = new SugarDecorator(new Coffee());
	System.out.println(sugarCoffee.getHotDrinkDescription()+", Price: "+sugarCoffee.getPrice()+" Cents");
	
	HotDrink sugar2CreamCoffee = new SugarDecorator(new CreamDecorator(new Coffee(),2));
	System.out.println(sugar2CreamCoffee.getHotDrinkDescription()+", Price: "+sugar2CreamCoffee.getPrice()+" Cents");

	//extra
	HotDrink creamMulledWine = new CreamDecorator(new MulledWine());
	System.out.println(creamMulledWine.getHotDrinkDescription()+", Price: "+creamMulledWine.getPrice()+" Cents");
	
	}
}

