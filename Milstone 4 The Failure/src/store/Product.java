package store;
/**
 * Matthew Foley
 * @author 
 * June/July 2025
 */
public class Product {
	
	private int tempnum;
	private int stock;
	private int price;
	private String name;
	
	public Product(int tempnum, int stock, int price, String name) {
		super();
		this.tempnum = tempnum;
		this.stock = stock;
		this.price = price;
		this.name = name;
	}
	
	public String toString() {
		String returnValue = this.stock + "  in stock , "+ this.price + " gold per ," + this.name;
		return returnValue;
	}
	
	public int getTempnum() {
		return tempnum;
	}
	public void setTempnum(int tempnum) {
		this.tempnum = tempnum;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
