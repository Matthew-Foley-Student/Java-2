package store;
/**
 * Matthew Foley
 * @author 
 * June/July 2025
 */
public interface ProductInterface {
/**
 * interface for
 * @return
 * getting names
 */
	public String getName();
	/**
	 * interface for
	 * @return
	 * getting prices
	 */
	public int getPrice();
	/**
	 * interface for
	 * @return
	 * getting quantities
	 */
	public int getQuant();
	/**
	 * interface for
	 * @return
	 * changing and setting new quantities
	 */
	public int settempquant();
	/**
	 * interface for
	 * @return
	 * setting a temporary quantity
	 */
	public int setTempQuant();
	/**
	 * backup for the temporary quantity
	 * @param tempquant
	 * setting interface
	 */
	void setTempQuant(int tempquant);

}
