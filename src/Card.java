
public class Card {

	Card(){}
	Card(Person person){
		this.person=person;
		int a=0;
		a=bank.generateCardNumber();
		this.cardNumber=a;
		this.balance=0;
			
	}

	private int cardNumber;
	private double balance;
	private Bank bank;
	private Person person;
	

	
	public int getCardNumber()
	{
		return cardNumber;
	}
	public Person getPerson()
	{
		return person;
	}
	public Bank getBank()
	{
		return bank;
	}
	public double getBalance()
	{
		return balance;
	}
	public void payIn(double amount) {
		balance+=amount;
	}
//trzeba stworzyc obsluge wyjatkow dla amount<0 i balance<0
	public void withdraw(double amount) {
		balance-=amount;
		
	}


}
