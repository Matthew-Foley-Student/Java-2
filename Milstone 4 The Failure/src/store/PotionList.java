package store;

import java.util.ArrayList;
import java.util.List;

public class PotionList {
	private List<Product> PotionList = new ArrayList<Product>();

	public PotionList() {
		this.PotionList = new ArrayList<Product>();
	}
	
	public PotionList(List<Product> PotionList) {
		super();
		this.PotionList = PotionList;
	}

	public List<Product> getPotionList() {
		return PotionList;
	}

	public void setPotionList(List<Product> PotionList) {
		this.PotionList = PotionList;
	}


}
