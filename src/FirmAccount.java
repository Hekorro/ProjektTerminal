//zastanowic sie jak w klasie Card i FirmACCOUNT ogarnac zmienna bank ("zaimportowac")
public class FirmAccount {

	private Firm firm;
	private double balance;
	private Bank bank; // ???
	private int accountNumber;
	
	
	FirmAccount(){}
	FirmAccount(Firm firm){
		this.firm = firm;
		this.balance = 0;
		this.bank = bank; // ???
		//this.accountNumber = losowo wygenerowana liczba patrz-> karta
	}
	

public Bank getBank() {
	return bank;
}


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
	public void payIn(double amount) {
		this.balance = this.balance + amount;
	}
	
	
}
