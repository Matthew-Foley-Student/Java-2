package store;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Matthew Foley
 * @author
 * June/July 2025
 */
public class StoreFront {



	 static Scanner scnr = new Scanner(System.in);
	 /**
	  * runs the store
	  * @param args
	  * by using if statements
	  * @throws Exception
	  * to make a full store and even a shopping kart
	  */
		public static void main(String[] args) throws Exception  {
		ArrayList<Kart> saleCustomer = new ArrayList<Kart>();
	Product Cloth = new Product(11, 5, "ClothArmor");
	int ArmorL = 0;
	Product Chain = new Product(15, 50, "Chainmail");
	int ArmorM = 0;
 	Product Plate = new Product(22, 150, "PlateMale");
 	int ArmorH = 0;
	
	Product HealS = new Product(8, 52, "HealSmall");
	int PotionS =0;
	Product HealM = new Product(3, 285, "HealMedium");
	int PotionM =0;
	Product HealG = new Product(5, 578, "HealLarge");
	int PotionG =0;
	
	Product LongSword = new Product(19, 15, "LongSword");
	int Long = 0;
	Product Dagger = new Product(46, 2, "Dagger");
	int Dagg = 0;
	Product Staff = new Product(30, 5, "Staff");
	int MagStaff = 0;
	Product Bow = new Product(36, 25, "Bow");
	int LongBow = 0;
	int gold =0;
	
			int exit = 0;
			while(exit == 0) {
				System.out.println();
				System.out.println();
				System.out.println("Please select a section to display whare's, 1 for armor, 2 for potions, and 3 for weapons.");
				System.out.println("Select 0 to finish shopping and select 9 to cancel the shopping and put all items back");
				 int numP = Integer.parseInt(scnr.nextLine());
				 if(numP == 1) {
					 System.out.println("There are 3 types of armor.");
					 System.out.println("Select 1 for the light Armor " + Cloth.getName() + ". There are " +Cloth.getQuant()+ " in stock. They have a price of " + Cloth.getPrice()+" gold per set.");
					 System.out.println("Select 2 for the medium Armor " + Chain.getName() + ". There are " +Chain.getQuant()+ " in stock. They have a price of " + Chain.getPrice()+" gold per set.");
					 System.out.println("Select 3 for the heavy Armor " + Plate.getName() + ". There are " +Plate.getQuant()+ " in stock. They have a price of " + Plate.getPrice()+" gold per set.");
					 System.out.println("or Select any other number to exit back to store front");
					 int sale = Integer.parseInt(scnr.nextLine());
					 if (sale ==1) {
						 System.out.println("How many "+ Cloth.getName()+ " do you want?");
						 int quant = Integer.parseInt(scnr.nextLine());
						 if (quant > Cloth.getQuant()) {
							 System.out.println("apoligies, but we only have " + Cloth.getQuant() + " in stock");
						 }else {
							 System.out.println("Now buying "+ quant + " " + Cloth.getName());
							 Cloth.setQuantity(Cloth.getQuant() - quant);
							 ArmorL=ArmorL+quant;
							 gold = gold+ Cloth.getPrice()*quant;
							 System.out.println("There are only " + Cloth.getQuant() + " " + Cloth.getName() + " left in stock ");
							 System.out.println("buying a total of " + ArmorL + " " + Cloth.getName());
						 }
					 }
					 if(sale ==2) {
						 System.out.println("How many "+ Chain.getName()+ " do you want?");
						 int quant = Integer.parseInt(scnr.nextLine());
						 if (quant > Chain.getQuant()) {
							 System.out.println("apoligies, but we only have " + Chain.getQuant() + " in stock");
						 }else {
							 System.out.println("Now buying "+ quant + " " + Chain.getName());
							 Chain.setQuantity(Chain.getQuant() - quant);
							 ArmorM=ArmorM+quant;
							 gold = gold+ Chain.getPrice()*quant;
							 System.out.println("There are only " + Chain.getQuant() + " " + Chain.getName() + " left in stock ");
							 System.out.println("buying a total of " + ArmorM + " " +Chain.getName());
							 
						 }
					 }
					 if(sale ==3) {
						 System.out.println("How many "+ Plate.getName()+ " do you want?");
						 int quant = Integer.parseInt(scnr.nextLine());
						 if (quant > Plate.getQuant()) {
							 System.out.println("apoligies, but we only have " + Plate.getQuant() + " in stock");
						 }else {
							 System.out.println("Now buying "+ quant + " " + Plate.getName());
							Plate.setQuantity(Plate.getQuant() - quant);
							 ArmorH=ArmorH+quant;
							 gold = gold+ Plate.getPrice()*quant;
							 System.out.println("There are only " + Plate.getQuant() + " " +Plate.getName() + " left in stock ");
							 System.out.println("buying a total of " + ArmorH + " " +Plate.getName());
						 }
					 }

					 
				 }if (numP == 2) {
						 System.out.println("There are 3 types of potions.");
						 System.out.println("Select 1 for the small potion " + HealS.getName() + ". There are " +HealS.getQuant()+ " in stock. They have a price of " + HealS.getPrice()+" gold per set.");
						 System.out.println("Select 2 for the medium potion " + HealM.getName() + ". There are " +HealM.getQuant()+ " in stock. They have a price of " + HealM.getPrice()+" gold per set.");
						 System.out.println("Select 3 for the large potion " + HealG.getName() + ". There are " +HealG.getQuant()+ " in stock. They have a price of " + HealG.getPrice()+" gold per set.");
						 System.out.println("or Select any other number to exit back to store front");
						 int sale = Integer.parseInt(scnr.nextLine());
						 if (sale ==1) {
							 System.out.println("How many "+ HealS.getName()+ " do you want?");
							 int quant = Integer.parseInt(scnr.nextLine());
							 if (quant > HealS.getQuant()) {
								 System.out.println("apoligies, but we only have " + HealS.getQuant() + " in stock");
							 }else {
								 System.out.println("Now buying "+ quant + " " + HealS.getName());
								 HealS.setQuantity(HealS.getQuant() - quant);
								PotionS=PotionS+quant;
								 gold = gold+ HealS.getPrice()*quant;
								 System.out.println("There are only " + HealS.getQuant() + " " +HealS.getName() + " left in stock ");
								 System.out.println("buying a total of " + PotionS + " " + HealS.getName());
							 }
						 }
						 if(sale ==2) {
							 System.out.println("How many "+ HealM.getName()+ " do you want?");
							 int quant = Integer.parseInt(scnr.nextLine());
							 if (quant > HealM.getQuant()) {
								 System.out.println("apoligies, but we only have " + HealM.getQuant() + " in stock");
							 }else {
								 System.out.println("Now buying "+ quant + " " + HealM.getName());
								 HealM.setQuantity(HealM.getQuant() - quant);
								 PotionM=PotionM+quant;
								 gold = gold+ HealM.getPrice()*quant;
								 System.out.println("There are only " + HealM.getQuant() + " " + HealM.getName() + " left in stock ");
								 System.out.println("buying a total of " + PotionM + " " +HealM.getName());
							 }
						 }
						 if(sale ==3) {
							 System.out.println("How many "+ HealG.getName()+ " do you want?");
							 int quant = Integer.parseInt(scnr.nextLine());
							 if (quant > HealG.getQuant()) {
								 System.out.println("apoligies, but we only have " + HealG.getQuant() + " in stock");
							 }else {
								 System.out.println("Now buying "+ quant + " " +HealG.getName());
								HealG.setQuantity(HealG.getQuant() - quant);
								 PotionG=PotionG+quant;
								 gold = gold+ HealG.getPrice()*quant;
								 System.out.println("There are only " + HealG.getQuant() + " " +HealG.getName() + " left in stock ");
								 System.out.println("buying a total of " + PotionG+ " " +HealG.getName());
							 }
						 }

					 
				 }if (numP == 3) {
					 System.out.println("There are 4 types of Weapons.");
					 System.out.println("Select 1 for the " + LongSword.getName() + ". There are " +LongSword.getQuant()+ " in stock. They have a price of " + LongSword.getPrice()+" gold per set.");
					 System.out.println("Select 2 for the " + Dagger.getName() + ". There are " +Dagger.getQuant()+ " in stock. They have a price of " + Dagger.getPrice()+" gold per set.");
					 System.out.println("Select 3 for the " + Staff.getName() + ". There are " +Staff.getQuant()+ " in stock. They have a price of " + Staff.getPrice()+" gold per set.");
					 System.out.println("Select 4 for the " + Bow.getName() + ". There are " +Bow.getQuant()+ " in stock. They have a price of " + Bow.getPrice()+" gold per set.");
					 System.out.println("or Select any other number to exit back to store front");
					 int sale = Integer.parseInt(scnr.nextLine());
					 
					 if (sale ==1) { 
						 System.out.println("How many "+ LongSword.getName()+ " do you want?");
					 int quant = Integer.parseInt(scnr.nextLine());
					 if (quant > LongSword.getQuant()) {
						 System.out.println("apoligies, but we only have " + LongSword.getQuant() + " in stock");
					 }else {
						 System.out.println("Now buying "+ quant + " " + LongSword.getName());
						 LongSword.setQuantity(LongSword.getQuant() - quant);
						Long=Long+quant;
						 gold = gold+ LongSword.getPrice()*quant;
						 System.out.println("There are only " + LongSword.getQuant() + " " +LongSword.getName() + " left in stock ");
						 System.out.println("buying a total of " + Long + " " + LongSword.getName());
					 }
						 
					 }
					 if (sale ==2) { 
						 System.out.println("How many "+ Dagger.getName()+ " do you want?");
					 int quant = Integer.parseInt(scnr.nextLine());
					 if (quant > Dagger.getQuant()) {
						 System.out.println("apoligies, but we only have " +Dagger.getQuant() + " in stock");
					 }else {
						 System.out.println("Now buying "+ quant + " " + Dagger.getName());
						 Dagger.setQuantity(Dagger.getQuant() - quant);
						Dagg=Dagg+quant;
						 gold = gold+ Dagger.getPrice()*quant;
						 System.out.println("There are only " + Dagger.getQuant() + " " +Dagger.getName() + " left in stock ");
						 System.out.println("buying a total of " + Dagg + " " + Dagger.getName());
					 } 
					 }
					 if (sale ==3) { 
						 System.out.println("How many "+ Staff.getName()+ " do you want?");
					 int quant = Integer.parseInt(scnr.nextLine());
					 if (quant > Staff.getQuant()) {
						 System.out.println("apoligies, but we only have " +Staff.getQuant() + " in stock");
					 }else {
						 System.out.println("Now buying "+ quant + " " +Staff.getName());
						 Staff.setQuantity(Staff.getQuant() - quant);
						MagStaff=MagStaff+quant;
						 gold = gold+ Staff.getPrice()*quant;
						 System.out.println("There are only " + Staff.getQuant() + " " +Staff.getName() + " left in stock ");
						 System.out.println("buying a total of " + MagStaff + " " + Staff.getName());
					 }
					 }
					 if (sale ==4) { 
						 System.out.println("How many "+ Bow.getName()+ " do you want?");
					 int quant = Integer.parseInt(scnr.nextLine());
					 if (quant > Bow.getQuant()) {
						 System.out.println("apoligies, but we only have " +Bow.getQuant() + " in stock");
					 }else {
						 System.out.println("Now buying "+ quant + " " +Bow.getName());
						 Bow.setQuantity(Bow.getQuant() - quant);
						LongBow=LongBow+quant;
						 gold = gold+ Bow.getPrice()*quant;
						 System.out.println("There are only " + Bow.getQuant() + " " +Bow.getName() + " left in stock ");
						 System.out.println("buying a total of " + LongBow+ " " + Bow.getName());
					 }
					 }

				 }if (numP==0) {
					 int total = ArmorL+ArmorM+ArmorH+PotionS+PotionM+PotionG+Long+Dagg+MagStaff+LongBow;
					 System.out.println("Buying a total of " +total+ " Items for a total of " +gold+ " gold");
					 exit=1;
				 }if (numP==9) {
			System.out.println("canceling shopping and putting items back");
			Cloth.setQuantity(ArmorL+Cloth.getQuant());
			Chain.setQuantity(ArmorM+Chain.getQuant());
			Plate.setQuantity(ArmorH+Plate.getQuant());
			HealS.setQuantity(PotionS+HealS.getQuant());
			HealM.setQuantity(PotionM+HealM.getQuant());
			HealG.setQuantity(PotionG+HealG.getQuant());
			LongSword.setQuantity(Long + LongSword.getQuant());
			Dagger.setQuantity(Dagg+Dagger.getQuant());
			Staff.setQuantity(MagStaff+Staff.getQuant());
			Bow.setQuantity(LongBow+Bow.getQuant());
			exit = 1;
				 } 
					 
				 
			}
			System.out.println("There are 3 types of armor");
			 System.out.println("the light Armor " + Cloth.getName() + ". There are " +Cloth.getQuant()+ " in stock.");
			 System.out.println("the medium Armor " + Chain.getName() + ". There are " +Chain.getQuant()+ " in stock. ");
			 System.out.println("the heavy Armor " + Plate.getName() + ". There are " +Plate.getQuant()+ " in stock.");
			 System.out.println("There are 3 types of potions");
			 System.out.println("the small potion " + HealS.getName() + ". There are " +HealS.getQuant()+ " in stock. " );
			 System.out.println("the medium potion " + HealM.getName() + ". There are " +HealM.getQuant()+ " in stock. " );
			 System.out.println("the large potion " + HealG.getName() + ". There are " +HealG.getQuant()+ " in stock.");
			 System.out.println("There are 4 types of Weapons.");
			 System.out.println("the " + LongSword.getName() + ". There are " +LongSword.getQuant()+ " in stock.");
			 System.out.println("the " + Dagger.getName() + ". There are " +Dagger.getQuant()+ " in stock.");
			 System.out.println("the " + Staff.getName() + ". There are " +Staff.getQuant()+ " in stock.");
			 System.out.println("the " + Bow.getName() + ". There are " +Bow.getQuant()+ " in stock.");
			
		}

	 
}
