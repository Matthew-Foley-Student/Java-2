package store;

import java.util.Random;
import java.util.Scanner;


/**
 * Matthew Foley
 * @author
 * June/July 2025
 */
public class StoreFront {
	private static void displayName(Product Product) {
		System.out.print(Product.getName() + "s");
	}
	private static void displayStock(Product Product) {
		System.out.print(Product.getQuant());
	}
	private static void displayPrice(Product Product) {
		System.out.print(Product.getPrice() + " Gold");
	}
	private static void displayTempQuant(Product Prodcut) {
		System.out.print(Prodcut.getTempQuant());
	}




	 static Scanner scnr = new Scanner(System.in);
	 /**
	  * runs the store
	  * @param args
	  * by using if statements
	  * @throws Exception
	  * to make a full store and even a shopping kart
	  */
		public static void main(String[] args) throws Exception  {
			Random random = new Random() ;
			int randQuant = random.nextInt(125);
			int randPrice = random.nextInt(50);
			randQuant = random.nextInt(125);
			randPrice = random.nextInt(50);
			try (Scanner scnr = new Scanner(System.in)) {
				Product[] weapons = new Product[4];
				weapons[0] = new Weapon (0,randQuant,randPrice,"LongSword");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(50);
				weapons[1] = new Weapon (0,randQuant,randPrice,"Dagger");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(50);
				weapons[2] = new Weapon (0,randQuant,randPrice,"Bow");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(50);
				weapons[3] = new Weapon (0,randQuant,randPrice,"Staff");
				
				Product[] Potions = new Product[4];
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(1,5);
				Potions[0] = new Potion(0,randQuant,randPrice,"Potion");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(50);
				Potions[1] = new Potion(0,randQuant,randPrice,"Small Potion");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(51,150);
				Potions[2] = new Potion(0,randQuant,randPrice,"Medium Potion");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(151,250);
				Potions[3] = new Potion(0,randQuant,randPrice,"Large Potion");
				
				Product[] Armor = new Product[4];
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(10);
				Armor[0] = new Armor(0,randQuant,randPrice,"Shield");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(10);
				Armor[1] = new Armor(0,randQuant,randPrice,"Hard Leather");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(10,50);
				Armor[2] = new Armor(0,randQuant,randPrice,"Chain Mail");
				randQuant = random.nextInt(125);
				randPrice = random.nextInt(50,150);
				Armor[3] = new Armor(0,randQuant,randPrice,"Plate");
				

				int exit = 0;
				int choice;
				int vari;
				int temp;
				int trueExit = 0;
				while(trueExit == 0) {
					System.out.println("Please select 1 to see weapons, 2 to see potions, 3 to see armor, 4 to cancel the entire order, or 5 to confirm final purchase");
					choice = scnr.nextInt();
					System.out.println();
					if(choice < 6 || choice>0) {
						exit = choice;
					}else {
						System.out.println("Please only select one of the provided options");
					}	
				
				while (exit ==1) {
					for (int x=0;x<weapons.length;++x) {
						System.out.print("In spot " +(x) + " is ");
						displayName(weapons[x]);
						System.out.print(" The number in stock is ");
						displayStock(weapons[x]);
						System.out.print(" and the total amount per item is ");
						displayPrice(weapons[x]);
						System.out.println();
					}
					System.out.println();
					System.out.println("Please select the spot of the item you wish to purchase is in or click 9 to go back");
					choice = scnr.nextInt();
					if(choice == 0 ||choice == 1 ||choice ==2 ||choice ==3) {
						vari = choice;
						System.out.println();
						System.out.print("How many ");
						displayName(weapons[vari]);
						System.out.print(" would you like to purchase");
						choice = scnr.nextInt();
						if (choice > weapons[vari].getQuant()) {
							System.out.println("There are not enough in stock. Select any number to go back");
							choice = scnr.nextInt();					}
					else {
						System.out.print("are you sure you want " +choice + " ");
						temp = choice;
						displayName(weapons[vari]);
						System.out.print(" as it is the total number that will be in yout kart regaurdless of how many are currently in it click 1 for yes anything else for no ");
						choice = scnr.nextInt();
						if (choice ==1) {
						 weapons[vari].setTempQuant(temp);
						 System.out.println(weapons[vari].getTempQuant() + " will be put into the kart");
						}
					}
				}
					if (choice ==9){
						System.out.println("You have put the following into your kart ");
						System.out.println();
						for (int x=0;x<weapons.length;++x) {
							displayName(weapons[x]);
							System.out.print(" a total of " );
							displayTempQuant(weapons[x]);
							System.out.println();
						}
					exit = 0;
					System.out.println();
					System.out.println();
					}
						
						else {
					System.out.println("Please only click the available options");
				}
				}//End of sub 1 loop	
					

				
				while (exit ==2) {
					for (int x=0;x<Potions.length;++x) {
						System.out.print("In spot " +(x) + " is ");
						displayName(Potions[x]);
						System.out.print(" The number in stock is ");
						displayStock(Potions[x]);
						System.out.print(" and the total amount per item is ");
						displayPrice(Potions[x]);
						System.out.println();
					}
					System.out.println();
					System.out.println("Please select the spot of the item you wish to purchase is in or click 9 to go back");
					choice = scnr.nextInt();
					if(choice == 0 ||choice == 1 ||choice ==2 ||choice ==3) {
						vari = choice;
						System.out.println();
						System.out.print("How many ");
						displayName(Potions[vari]);
						System.out.print(" would you like to purchase");
						choice = scnr.nextInt();
						if (choice > Potions[vari].getQuant()) {
							System.out.println("There are not enough in stock. Select any number to go back");
							choice = scnr.nextInt();					}
					else {
						System.out.print("are you sure you want " +choice + " ");
						temp = choice;
						displayName(Potions [vari]);
						System.out.print(" as it is the total number that will be in yout kart regaurdless of how many are currently in it click 1 for yes anything else for no ");
						choice = scnr.nextInt();
						if (choice ==1) {
						 Potions[vari].setTempQuant(temp);
						 System.out.println(Potions[vari].getTempQuant() + " will be put into the kart");
						}
					}
				}
					if (choice ==9){
						System.out.println("You have put the following into your kart ");
						System.out.println();
						for (int x=0;x<Potions.length;++x) {
							displayName(Potions [x]);
							System.out.print(" a total of " );
							displayTempQuant(Potions[x]);
							System.out.println();
						}
					exit = 0;
					System.out.println();
					System.out.println();
					}
						
						else {
					System.out.println("Please only click the available options");
				}
				}//End of sub 2 loop	
					



				while (exit ==3) {
					for (int x=0;x<Armor.length;++x) {
						System.out.print("In spot " +(x) + " is ");
						displayName(Armor[x]);
						System.out.print(" The number in stock is ");
						displayStock(Armor[x]);
						System.out.print(" and the total amount per item is ");
						displayPrice(Armor[x]);
						System.out.println();
					}
					System.out.println();
					System.out.println("Please select the spot of the item you wish to purchase is in or click 9 to go back");
					choice = scnr.nextInt();
					if(choice == 0 ||choice == 1 ||choice ==2 ||choice ==3) {
						vari = choice;
						System.out.println();
						System.out.print("How many ");
						displayName(Armor[vari]);
						System.out.print(" would you like to purchase");
						choice = scnr.nextInt();
						if (choice > Armor[vari].getQuant()) {
							System.out.println("There are not enough in stock. Select any number to go back");
							choice = scnr.nextInt();					}
					else {
						System.out.print("are you sure you want " +choice + " ");
						temp = choice;
						displayName(Armor [vari]);
						System.out.print(" as it is the total number that will be in yout kart regaurdless of how many are currently in it click 1 for yes anything else for no ");
						choice = scnr.nextInt();
						if (choice ==1) {
						 Armor[vari].setTempQuant(temp);
						 System.out.println(Armor[vari].getTempQuant() + " will be put into the kart");
						}
					}
				}
					if (choice ==9){
						System.out.println("You have put the following into your kart ");
						System.out.println();
						for (int x=0;x<Armor.length;++x) {
							displayName(Armor [x]);
							System.out.print(" a total of " );
							displayTempQuant(Armor[x]);
							System.out.println();
						}
					exit = 0;
					System.out.println();
					System.out.println();
					}
						
						else {
					System.out.println("Please only click the available options");
				}
				}//End of sub 3 loop	

				if (exit ==4) {	
					System.out.println("Putting all items back");
					System.out.println("Weapons::");
					for (int x=0;x<weapons.length;++x) {
						displayName(weapons[x]);
						System.out.print(" The number in stock is ");
						displayStock(weapons[x]);
						System.out.println();
					}
					System.out.println("Potions::");
					for (int x=0;x<Potions.length;++x) {
						displayName(Potions[x]);
						System.out.print(" The number in stock is ");
						displayStock(Potions[x]);
						System.out.println();
					}
					System.out.println("Armor::");
					for (int x=0;x<Armor.length;++x) {
						displayName(Armor[x]);
						System.out.print(" The number in stock is ");
						displayStock(Armor[x]);
						System.out.println();
					}
					trueExit = 1;
				}//End of sub 4 loop
				int tempquant;
				if(exit ==5) {
					System.out.println("Weapons::");
					for (int x=0;x<weapons.length;++x) {
						tempquant = weapons[x].getQuant()- weapons[x].getTempQuant();
						weapons[x].setQuantity(tempquant);
						
						displayName(weapons[x]);
						System.out.print(" The number in stock is ");
						displayStock(weapons[x]);
						System.out.println();
					}
					System.out.println("Potions::");
					for (int x=0;x<Potions.length;++x) {
						tempquant = Potions[x].getQuant() - Potions[x].getTempQuant();
						Potions[x].setQuantity(tempquant);
						displayName(Potions[x]);
						System.out.print(" The number in stock is ");
						displayStock(Potions[x]);
						System.out.println();
					}
					System.out.println("Armor::");
					for (int x=0;x<Armor.length;++x) {
						tempquant =  Armor[x].getQuant()-Armor[x].getTempQuant();
						Armor[x].setQuantity(tempquant);
						displayName(Armor[x]);
						System.out.print(" The number in stock is ");
						displayStock(Armor[x]);
						System.out.println();
					}
					trueExit = 1;
				}
					



 


				}//The end of the main 0 while loop
			}
			}
}
