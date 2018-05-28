//zastanowic sie jak w klasie Card i FirmACCOUNT ogarnac zmienna bank ("zaimportowac")
public class FirmAccount {

	private Firm firm;
	private double balance;
	private Bank bank; // ???
	private int accountNumber;
	
	
	FirmAccount(){}
<<<<<<< HEAD
	FirmAccount(Firm firm){
=======
	FirmAccount(Firm firm, int number){
>>>>>>> 958b03f0f677ff1c0604402198589d5d60b5f496
		this.firm = firm;
		this.balance = 0;
		this.accountNumber = number;
	}
	
<<<<<<< HEAD

public Bank getBank() {
	return bank;
}


	public double getBalance() {
		return balance;
	}


	public Firm getFirm()
	{
		return firm;
=======

	public double getBalance() {
		return balance;
	}
	public Firm getFirm(){
		return this.firm;
	}
	public Bank getBank() {
		return this.bank;
>>>>>>> 958b03f0f677ff1c0604402198589d5d60b5f496
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void payIn(double amount) {
		this.balance = this.balance + amount;
	}
	
	
}
