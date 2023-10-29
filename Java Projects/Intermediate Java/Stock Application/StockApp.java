
import java.util.ArrayList;
import java.util.Scanner;

public class StockApp {

	public static int totalAccounts = 0;
	static ArrayList<StockAccount> accounts = new ArrayList<StockAccount>();

	public static void printMenu() {
		System.out.println("1. Create a new account.");
		System.out.println("2. Remove an existing account.");
		System.out.println("3. Add a new stock to an existing account.");
		System.out.println("4. Remove an existing stock from an account.");
		System.out.println("5. Update number of shares in a stock for an account");
		System.out.println("0. Exit");
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int choice;
		int option;
		String managerName = "";
		String institutionName = "";
		String retailName = "";
		String newName = "";
		String tickerCompare = "";
		int accountID;
		int numShares;
		int currValue;
		Stock change;

		System.out.println("Welcome to Stock Broker App!");
		do {
			printMenu();
			System.out.println();

			choice = scnr.nextInt();
			scnr.nextLine(); // clears the output to put new int

			if (choice == 0) {
				System.out.println("Thanks for using Stock App. Exiting!");
			} else if (choice == 1) {
				System.out.println("Select the account type: ");
				System.out.println("1. Institutional\n2.Retail");
				option = scnr.nextInt();
				scnr.nextLine();
				if (option == 1) {
					System.out.println("Enter the institution's name: ");
					institutionName = scnr.nextLine();
					System.out.println("Enter the manager's name: ");
					managerName = scnr.nextLine();
					accounts.add(new Institutional(managerName, institutionName));
				} else if (option == 2) {
					System.out.println("Enter your name: ");
					retailName = scnr.nextLine();
					accounts.add(new Retail(retailName));
				} else {
					System.out.println("Invalid. Returning to main menu.");
					// **NEED TO RETURN TO MAIN MENU
				}
			} else if (choice == 2) {
				System.out.println("Enter your account ID: ");
				// get account ID and delete it
				accountID = scnr.nextInt();
				scnr.nextLine();
				if (accounts.get(accountID) != null) { // if the account exists
					accounts.remove(accountID);
				}

			} else if (choice == 3) {
				// get account ID
				/*
				 * if account does not exist
				 * System.out.println("No account with given ID exists.");
				 */
				System.out.println("Enter your account ID: ");
				// get account ID and delete it
				accountID = scnr.nextInt();
				scnr.nextLine();
				StockAccount temp = null;
				for (StockAccount s : accounts) { // accounts is the ArrayList
					if (s.getID() == accountID)
						temp = s;
				}
				if (temp == null) {
					System.out.println("No account with given ID exists.");
					// **NEED TO RETURN TO MAIN MENU

				} else {
					System.out.println("Enter the name: ");
					newName = scnr.nextLine();

					System.out.println("Enter the ticker: ");
					tickerCompare = scnr.nextLine();

					System.out.println("Enter number of shares: ");
					numShares = scnr.nextInt();
					scnr.nextLine();

					System.out.println("Enter current value: ");
					currValue = scnr.nextInt();
					scnr.nextLine();
					change = new Stock(tickerCompare, newName, numShares, currValue);
					temp.addStock(change);

					if (temp.addStock(change) == false) {
						System.out.println("Stock added successfully.");
					} else {
						System.out.println("Stock already exists.");
					}
				}
			} else if (choice == 4) {
				System.out.println("Enter your account ID: ");
				// get account ID and delete it
				accountID = scnr.nextInt();
				scnr.nextLine();
				StockAccount temp = null;
				for (StockAccount s : accounts) { // accounts is the ArrayList
					if (s.getID() == accountID)
						temp = s;
				}
				if (temp == null) {
					System.out.println("No account with given ID exists.");
					// **NEED TO RETURN TO MAIN MENU

				} else {
					System.out.println("Enter the ticker: ");
					tickerCompare = scnr.nextLine();

					Stock tempStock = null;
					for (Stock t : temp.getStocksOwned()) {
						if (t.getTicker().equals(tickerCompare)) {
							tempStock = t;
						}
					}

					if (tempStock == null) {
						System.out.println("Ticker does not exist");
					} else {
						temp.removeStock(tempStock);
					}

				}
			} else if (choice == 5) {
				System.out.println("Enter your account ID: ");
				// get account ID and delete it
				accountID = scnr.nextInt();
				scnr.nextLine();
				StockAccount temp = null;
				for (StockAccount s : accounts) { // accounts is the ArrayList
					if (s.getID() == accountID)
						temp = s;
				}
				if (temp == null) {
					System.out.println("No account with given ID exists.");
					// **NEED TO RETURN TO MAIN MENU

				} else {
					System.out.println("Enter the ticker: ");
					tickerCompare = scnr.nextLine();

					Stock tempStock = null;
					for (Stock t : temp.getStocksOwned()) {
						if (t.getTicker().equals(tickerCompare)) {
							tempStock = t;
						}
					}

					if (tempStock == null) {
						System.out.println("Ticker does not exist");
					} else {
						System.out.println("Buy or Sell shares:");
						System.out.println("1. Buy shares\n2. Sell shares");
						option = scnr.nextInt();
						scnr.nextLine();

						if (option == 1) {
							System.out.println("Enter number of shares to buy: ");
							numShares = scnr.nextInt();
							scnr.nextLine();
							tempStock.buyShares(numShares);
						} else if (option == 2) {
							System.out.println("Enter number of shares to sell: ");
							numShares = scnr.nextInt();
							scnr.nextLine();
							tempStock.sellShares(numShares);
						}
					}

				}
			} else {
				System.out.println("Invalid option entered.");
				// **NEED TO RETURN TO MAIN MENU
			}
		} while (choice != 0);
		scnr.close();
	}
}