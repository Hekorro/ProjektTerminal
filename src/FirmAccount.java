//zastanowic sie jak w klasie Card i FirmACCOUNT ogarnac zmienna bank ("zaimportowac")
public class FirmAccount {

	private Firm firm;
	private double balance;
	private Bank bank; // ???
	private int accountNumber;
	
	
	FirmAccount(){}


	FirmAccount(Firm firm, int number){
		this.firm = firm;
		this.balance = 0;
		this.accountNumber = number;
	}

	public double getBalance() {
		return balance;
	}
	public Firm getFirm(){
		return this.firm;
	}
	public Bank getBank() {
		return this.bank;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void payIn(double amount) {
		this.balance = this.balance + amount;
	}
	
	
}
