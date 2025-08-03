package store;

public class Potion extends Product{
	/**
	 * sets the load for Potions including
	 * @param tempquant
	 * a temp quantity to help adjust after finished
	 * @param quantity
	 * quantities to keep careful track of actual stock
	 * @param price
	 * the price of how much each item is worth
	 * @param name
	 * and the actual name of the item itself
	 */
	public Potion(int tempquant,int quantity, int price, String name) {
		super(tempquant,quantity, price, name);
		// TODO Auto-generated constructor stub
	}
	/**
	 * gets the name for the spacific item
	 */
	public String getName() {
		return name;
	}
	/**
	 * gets the price for the spacific item
	 */
	public int getPrice() {
		return  price;
	}
	/**
	 * getting quantities for spacific items
	 */
	public int getQuant() {
		return quantity;
	}


}
