
public class FirmAccount {

	private Firm firm;
	private double balance;
	private Bank bank; // ???
	private int accountNumber;
	
	
	FirmAccount(){}
	FirmAccount(Firm firm, Bank bank){
		this.firm = firm;
		this.balance = 0;
		this.bank = bank; // ???
		//this.accountNumber = losowo wygenerowana liczba patrz-> karta
	}
	
	
	public double getBalance() {
		return this.balance;
	}
	public Firm getFirm(){
		return this.firm;
	}
	public Bank getBank() {
		return this.bank;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public void payIn(double amount) {
		this.balance = this.balance + amount;
	}
	
	
}
