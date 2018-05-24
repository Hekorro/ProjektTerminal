
public class FirmAccount {

	FirmAccount(){}
	FirmAccount(Firm firm){
		this.firm=firm;
	}
	
private Firm firm;
private double balance;
private Bank bank;
private int accountNumber;

	public double getBalance() {
		return this.balance;
	}
	public Firm getFirm()
	{
		return this.firm;
	}
	public Bank getBank() {
		return this.bank;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public void payIn(double amount) {}
	
	
}
