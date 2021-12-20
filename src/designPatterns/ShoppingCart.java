package designPatterns;

public class ShoppingCart {
	private int id;
	private String geoLocation;
	private String brand;
	
	// Constructor
	public ShoppingCart (int id, String geoLocation, String brand) {
		this.id = id;
		this.geoLocation = geoLocation;
		this.brand = brand;
	}
	
    // Getters
	public int getID() {
        return id;
    }
	
	public String getGeoLocation() {
        return geoLocation;
    }
	
	public String getBrand() {
        return brand;
    }
	
	// Setters
	public void setID(int id) {
        this.id=id;
    }
	
	public void setGeoLocation(String geoLocation) {
		this.geoLocation=geoLocation;
    }
	
	public void setBrand(String brand) {
		this.brand=brand;
    }
	
}
