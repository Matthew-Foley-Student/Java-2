package store;

import java.util.ArrayList;
import java.util.List;

/**
 * Matthew Foley
 * @author 
 * June/July 2025
 */
public class ArmorList {
	private List<Product> ArmorList = new ArrayList<Product>();

	public ArmorList() {
		this.ArmorList = new ArrayList<Product>();
	}
	
	public ArmorList(List<Product> ArmorList) {
		super();
		this.ArmorList = ArmorList;
	}

	public List<Product> getArmorList() {
		return ArmorList;
	}

	public void setArmorList(List<Product> ArmorList) {
		this.ArmorList = ArmorList;
	}


}
