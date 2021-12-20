package designPatterns;
import java.util.ArrayList;

public class ShoppingCartList implements Subject {
	private ArrayList<ShoppingCart> carts = new ArrayList<ShoppingCart>();
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	@Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
	
	@Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
	
	@Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(carts);
        }
    }


}
