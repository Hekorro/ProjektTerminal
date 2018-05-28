
public class Card {
	
	private int cardNumber;
	private double balance;
	private Bank bank;
	private Person person;
	
	Card(){}
	Card(Person person){
		this.person = person;
	}
	
	public int getCardNumber()
	{
		return this.cardNumber;
	}
	public Person getPerson()
	{
		return this.person;
	}
	public Bank getBank()
	{
		return this.bank;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void payIn(double amount) {
		this.balance = this.balance + amount;
		return;
	}
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		return;
	}
	
}
