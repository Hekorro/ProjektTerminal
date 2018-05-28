//zastanowic sie jak w klasie Card i FirmACCOUNT ogarnac zmienna bank ("zaimportowac")
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
	
<<<<<<< HEAD
	
=======
private Firm firm;
private double balance;
private Bank bank;
public Bank getBank() {
	return bank;
}

private int accountNumber;

>>>>>>> 1ca712f1b6340262b752608dde38e98ef4424d85
	public double getBalance() {
		return balance;
	}
<<<<<<< HEAD
	public Firm getFirm(){
		return this.firm;
	}
	public Bank getBank() {
		return this.bank;
=======
	public Firm getFirm()
	{
		return firm;
>>>>>>> 1ca712f1b6340262b752608dde38e98ef4424d85
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void payIn(double amount) {
		this.balance = this.balance + amount;
	}
	
	
}
