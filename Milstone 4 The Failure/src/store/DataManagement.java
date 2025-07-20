package store;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class DataManagement {
	public WeaponList readAllWeaponData() {
		return null;
	}
	public ArmorList readAllArmorData() {
		return null;
	}
	public PotionList readAllPotionData() {
		return null;
	}

	public void writeAllWeaponData(WeaponList thelist) {
		ObjectMapper om = new ObjectMapper();
		try {
			om.writeValue(new File("Weapon.json"), thelist);
		} catch (StreamWriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void writeAllPotionData(PotionList thelist) {
		ObjectMapper om = new ObjectMapper();
		try {
			om.writeValue(new File("Potion.json"), thelist);
		} catch (StreamWriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeAllArmorDaya(ArmorList thelist) {
		ObjectMapper om = new ObjectMapper();
		try {
			om.writeValue(new File("Armor.json"), thelist);
		} catch (StreamWriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
