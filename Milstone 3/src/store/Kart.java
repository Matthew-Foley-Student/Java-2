package store;

import java.util.ArrayList;
/**
 * Matthew Foley
 * @author
 * June/July 2025
 */
public class Kart {
	private String productName;
	/**
	 * sets the name of 
	 * @return
	 * a single product
	 */
	public String getproductName() {
		return this.productName;
	}
	/**
	 * allows for a product
	 * @param productName
	 * name to be set
	 */
	public void setNameOfProduct(String productName) {
		this.productName = productName;
	}
	/**
	 * sets products into an array list
	 */
	private ArrayList<Product> receivedProduct= new ArrayList<Product>();
	/**
	 * displays the set array
	 * @return
	 * list be to viewed
	 */
	public ArrayList<Product> getAllReceivedProdut(){
		return this.receivedProduct;
	}
	/**
	 * sets the products
	 * @param receivedProduct
	 * as they are created
	 */
	public void setAllReceivedCard(ArrayList<Product> receivedProduct) {
		this.receivedProduct = receivedProduct;
	}
	/**
	 * sets the products
	 * @param singleProduct
	 * one at a time
	 */
	
	public void addAProductToKart(Product singleProduct) {
		receivedProduct.add(singleProduct);
	}
	/**
	 * shows what is in a particular array
	 */
	public void showAllProducts() {
		for (int i = 0; i<receivedProduct.size(); i++) {
			System.out.print(receivedProduct.get(i).getName());
			System.out.println();
			
		}
	}
	/**
	 * adds the amount in a array
	 * @return
	 * and returns the total for everything
	 */
	public int KartTotal(){
		int sumOfAllProducts = 0;
		int num = 0;
		String str = "";
		
		for (int i=0; i<receivedProduct.size(); i++) {
		
			try {
					str= receivedProduct.get(i).getName().strip();
				num = receivedProduct.get(i).getPrice();
				sumOfAllProducts = sumOfAllProducts + num;
			}
			catch(Exception e){
				System.out.println("Something went wrong with prodcut" + str);
				}

			}
		
		
		return sumOfAllProducts;
	
	}

}
