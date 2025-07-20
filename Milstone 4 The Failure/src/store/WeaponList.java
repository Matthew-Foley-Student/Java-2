package store;

import java.util.ArrayList;
import java.util.List;

public class WeaponList{
	private List<Product> weaponList = new ArrayList<Product>();

	public WeaponList() {
		this.weaponList = new ArrayList<Product>();
	}
	
	public WeaponList(List<Product> weaponList) {
		super();
		this.weaponList = weaponList;
	}

	public List<Product> getWeaponList() {
		return weaponList;
	}

	public void setWeaponList(List<Product> weaponList) {
		this.weaponList = weaponList;
	}

}
