package Interface;

public interface USBank {
	
	// Variables are static by default
	int min_bal = 100;
	
	// No method body in interface. Only method declaration (prototype)
	public void credit();
	public void debit();	
	public void transferMoney();

}
