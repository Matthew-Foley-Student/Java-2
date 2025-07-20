package store;

import java.util.ArrayList;

/**
 * Matthew Foley
 * @author
 * June/July 2025
 */
public class StoreFront {

		public static void main(String[] args){
			Product p1 = new Product(0,50,1,"PotionVerySmall");
			Product p2 = new Product(0,50,5,"PotionSmall");
			Product p3 = new Product(0,50,10,"Potion");
			Product p4 = new Product(0,50,25,"PotionLarge");
			Product p5 = new Product(0,50,45,"PotionHuge");
			Product p6 = new Product(0,50,75,"PotionExtream");
			
			Product a1 = new Product(0,50,1,"Cloth");
			Product a2 = new Product(0,50,5,"Leather");
			Product a3 = new Product(0,50,15,"Hide");
			Product a4 = new Product(0,50,35,"Scale");
			Product a5 = new Product(0,50,35,"Chain");
			Product a6 = new Product(0,50,65,"Splint");
			Product a7 = new Product(0,50,65,"Breast");
			Product a8 = new Product(0,50,80,"Plate");
			
			PotionList pl = new PotionList();
			ArmorList al = new ArmorList();
			ArrayList<Product> armorList = new ArrayList<Product>();
			ArrayList<Product> potionList = new ArrayList<Product>();
			armorList.add(a1);			armorList.add(a2);			armorList.add(a3);			armorList.add(a4);
			armorList.add(a5);			armorList.add(a6);			armorList.add(a7);			armorList.add(a8);
			al.setArmorList(armorList);
			potionList.add(p1);			potionList.add(p2);			potionList.add(p3);			potionList.add(p4);
			potionList.add(p5);			potionList.add(p6);
			pl.setPotionList(potionList);
			
			DataManagement dm = new DataManagement();
			dm.writeAllArmorDaya(al);
			dm.writeAllPotionData(pl);



			}//End Of Main Method
}
