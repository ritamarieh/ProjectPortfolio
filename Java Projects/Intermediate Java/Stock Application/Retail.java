
import java.util.ArrayList;
public class Retail implements StockAccount{

	private int ID;
	private String name;
	private String category;
	private ArrayList<Stock> stocksOwned;
	
	public Retail() {
		ID = StockApp.totalAccounts; 
		StockApp.totalAccounts += 1;
		name = "Retail " + ID;
		category = "Retail";
		stocksOwned = new ArrayList<Stock>();
	}
	
	public Retail(String name) {
		ID = StockApp.totalAccounts; 
		StockApp.totalAccounts += 1;
		this.name = name;
		category = "Retail";
		stocksOwned = new ArrayList<Stock>(); 
	}
	
	public  boolean addStock(Stock stock) {
		if ((stocksOwned.contains(stock)) || (stocksOwned.size() > 10)) {
			return false;
			}
			else {
				stocksOwned.add(stock);
				return true;
			}
	}
	
	public boolean removeStock(Stock stock) {
		if ((stock.getShares() > 0) || (!stocksOwned.contains(stock))) {
			return false;
		}
	 if (stock.getShares() == 0) {
			stocksOwned.remove(stock);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setCategory(String category) {
		this.category = category;
		
	}

	@Override
	public String getCategory() {
		
		return category;
	}

	@Override
	public int getID() {
		
		return ID;
	}

	@Override
	public ArrayList<Stock> getStocksOwned() {
		
		return stocksOwned;
	}
}
