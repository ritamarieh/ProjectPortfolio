import java.util.ArrayList;

public class Institutional implements StockAccount{

	private int ID; //id for stocks
	private String manager; //manager for specific id
	private String name; //name of institution
	private String category;
	private ArrayList<Stock> stocksOwned; //stocks owned
	
	//Constructor
	public Institutional() {
		ID = StockApp.totalAccounts;
		StockApp.totalAccounts += 1;
		manager = "Manager " + ID;
		name = "Institutional" + ID;
		category = "Institutional";
		stocksOwned = new ArrayList<Stock>(); 
	}
	
	//Overloaded constructor
	public Institutional(String manager, String name) {
		ID = StockApp.totalAccounts;
		StockApp.totalAccounts += 1;
		this.manager = manager;
		this.name = name;
		category = "Institutional";
		stocksOwned = new ArrayList<Stock>(); 
	}
	
	public boolean addStock(Stock stock) {
		
		if (stocksOwned.contains(stock)) {
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
		else {
			stocksOwned.remove(stock);
			return true;
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
