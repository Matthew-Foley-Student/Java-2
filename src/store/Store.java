package store;

import java.util.Random;
/**
 * Matthew Foley
 * @author 
 * June/July 2025
 */

public class Store {
/**
 * THe main set of code
 * @param args
 * that is used to enact the shopping actions
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product Cabbage = new Product(22, 2, "Cabbage");
		Product Cucumber = new Product(12, 4, "Cucumber");
		Product  Cloves= new Product(42, 1, "Cloves");
		Product Cauliflour = new Product(40, 7, "Cauliflour");
		Product Asparigaus = new Product(102, 2, "Asparigaus");
		Random rand = new Random();
		int amount = 0;
		int spend = 0;
		
//		System.out.println(Asparigaus.getPrice() + " " + Asparigaus.getQuant() +" "+ Asparigaus.getName() );
		
		int number = rand.ints(1, 50+1).findFirst().getAsInt();
		
		Product Fred = new Product (number,210,"Fred" );
		
		System.out.println(Fred.getName() +" wants to buy " +Fred.getQuant() + " cauliflaur");
		if(Fred.getQuant() > Cauliflour.getQuant()) {
			System.out.println("There is not enough cauliflour on the shelf so Fred leaves");
			System.out.println("There is only " + Cauliflour.getQuant() + " cauliflour on the shelves");
		}else {
			if((Fred.getPrice() < Cauliflour.getPrice() * Fred.getQuant())) {
				System.out.println("Fred did not have enough money to buy " + Fred.getQuant() + " cauliflour so he will put some back and get what he can");
			}
			
			while(Fred.getPrice() < Cauliflour.getPrice() * Fred.getQuant()){
				spend = Fred.getQuant() - 1;
				Fred.setQuantity(spend);
			}
			 amount = Cauliflour.getQuant();
			amount = amount - Fred.getQuant();
			Cauliflour.setQuantity(amount);
			System.out.println(Fred.getName() + " Decided to put the cauliflour in his cart and head to the checkout");
			spend = amount * Cauliflour.getPrice();
			System.out.println("There are " + Cauliflour.getQuant() + " Cauliflour left on the shelfs");		
			int number1 = rand.ints(1, 10+1).findFirst().getAsInt();
			
		if(number1 > 5) {
			
			System.out.println( Fred.getName()+ " Spends $" + spend );
		}else {
			System.out.println(Fred.getName() + "did not like that price and put the items back on the shelf");
			amount = amount + Fred.getQuant();
			Cauliflour.setQuantity(amount);
			System.out.println("After puting them back, there are " + Cauliflour.getQuant() + " cauliflour on the shelf");
		}
		}

	}

}
