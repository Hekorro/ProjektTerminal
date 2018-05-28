
public class Card {
	
	private int cardNumber;
	private double balance;
	private Bank bank; // ???
	private Person person;
	
	Card(){}
	Card(Person person, int number){
		this.person = person;
		this.cardNumber = number;
		this.balance = 0;
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
		this.balance+=amount;
	}
//trzeba stworzyc obsluge wyjatkow dla amount<0 i balance<0
	public void withdraw(double amount) {
		this.balance-=amount;
	}

	
}
