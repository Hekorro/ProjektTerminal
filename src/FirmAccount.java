//zastanowic sie jak w klasie Card i FirmACCOUNT ogarnac zmienna bank ("zaimportowac")
public class FirmAccount {

	FirmAccount(){}
	FirmAccount(Firm firm){
		this.firm=firm;
	}
	
private Firm firm;
private double balance;
private Bank bank;
public Bank getBank() {
	return bank;
}

private int accountNumber;

	public double getBalance() {
		return balance;
	}
	public Firm getFirm()
	{
		return firm;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void payIn(double amount) {}
	
	
}
