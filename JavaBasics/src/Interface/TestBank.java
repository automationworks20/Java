package Interface;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		
		// Only overridden methods will be called
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		// hs.carLoan(); Cannot be called 
		
		System.out.println(USBank.min_bal);
	}

}
