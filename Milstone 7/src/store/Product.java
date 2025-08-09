package store;
/**
 * Matthew Foley
 * @author 
 * June/July 2025
 */
public class Product implements ProductInterface{
	protected int quantity;
	protected int price;
	protected int tempquant;
	protected String name;
	/**
	 * Setting both Product and reusing the code for customer info
	 * @param quantity
	 * for quantity products are the amount in shop, and for customer how much they want
	 * @param price
	 * for product how much it is, and for customer how much money they have
	 * @param name
	 * for product the name, and for customer their name
	 */
	public Product(int tempquant,int quantity, int price, String name) {
		this.setName(name);
		this.price = price; 
		this.quantity = quantity;
		this.tempquant = tempquant;
	}
	/**
	 * gets the name
	 * @return
	 * to be shown
	 */
	public String getName() {
		return name;
	}
	/**
	 * allows for the name in place
	 * @param name
	 * to be changed
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * gets the price
	 * @return
	 * to be shown
	 */
	public int getPrice() {
		return  price;
	}
	/**
	 * allows the price to be changed
	 * @param price
	 * at any point
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * gets the quantity
	 * @return
	 * of whatever is needed
	 */
	public int getQuant() {
		return quantity;
	}
/**
 * lets you set a spacific
 * @param quantity
 * for any item that is specified
 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public void setTempQuant(int tempquant) {
		this.tempquant = tempquant;
	}
	/**
	 * gets a temporary
	 * @return
	 * quantity for using on the item it is stored on at a later time
	 */
	public int getTempQuant() {
		return tempquant;
	}
	@Override
	public int settempquant() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int setTempQuant() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
