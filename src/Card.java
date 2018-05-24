
public class Card {

	Card(){}
	Card(Person person){}
	
	private int cardNumber;
	private double balance;
	private Bank bank;
	private Person person;
	
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
	public void payIn(double amount) {}
	public void withdraw(double amount) {}
	
}
