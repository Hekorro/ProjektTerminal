import java.io.Serializable;

//zastanowic sie jak w klasie Card i FirmACCOUNT ogarnac zmienna bank ("zaimportowac")
public class FirmAccount implements  Serializable {

	private Firm firm;
	private double balance;
	private Bank bank; // ???
	private int accountNumber;
	
	
	FirmAccount(){}


	FirmAccount(Firm firm, Bank bank){
			int x=bank.getSerialNumber();
			int y=bank.getCardNumber();
			int z=x*10000;
			this.accountNumber=z+y;
			this.balance=0;
			this.firm = firm;
			this.bank=bank;
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
