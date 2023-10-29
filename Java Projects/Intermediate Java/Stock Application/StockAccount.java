import java.util.ArrayList;

public interface StockAccount {
	/**
	 * 
	 * @param name
	 * sets the name for institution or retail
	 */
	public void setName(String name);
	
	/**
	 * 
	 * @return
	 * gets the name for institution or retail
	 */
	public String getName();
	
	/**
	 * 
	 * @param category
	 * sets the category
	 */
	public void setCategory(String category);
	
	/**
	 * 
	 * @return category 
	 */
	public String getCategory();
	
	/**
	 * 
	 * @return ID
	 * gets the id of the stock
	 */
	public int getID();
	
	/**
	 * 
	 * @return ArrayList<Stock>
	 * will get the stocks owned from the declared arrayList
	 */
	public ArrayList<Stock> getStocksOwned();
	
	/**
	 * 
	 * @param stock
	 * @return boolean 
	 * adds stock if it doesn't exist
	 */
	public boolean addStock(Stock stock);
	
	/**
	 * 
	 * @param stock
	 * @return boolean
	 * removes current stock if it is 0
	 */
	public boolean removeStock(Stock st);

}
