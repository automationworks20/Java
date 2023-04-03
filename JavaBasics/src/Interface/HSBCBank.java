package Interface;

public class HSBCBank implements USBank, BrazilBank { // Achieving multiple inheritance
	// Is - a - relationship
	
	// Overriding from USBank
	public void credit() {
		System.out.println("HSBC Credit");		
	}

	public void debit() {
		System.out.println("HSBC Debit");		
	}

	public void transferMoney() {
		System.out.println("HSBC Transfer Money");	
	}
	
	// Separate methods of HSBCBank Class
	public void educationLoan() {
		System.out.println("HSBC Education Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}
		
	// Overriding from Brazil Bank
	public void mutualFund() {;
		System.out.println("HSBC Mutual Fund");
	}
}
