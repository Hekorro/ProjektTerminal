
public class Card {
<<<<<<< HEAD
=======

	Card(){}
	Card(Person person){
		this.person=person;
		int a=0;
		a=bank.generateCardNumber();
		this.cardNumber=a;
		this.balance=0;
			
	}
>>>>>>> 1ca712f1b6340262b752608dde38e98ef4424d85
	
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
<<<<<<< HEAD
	public void payIn(double amount) {
		this.balance = this.balance + amount;
		return;
	}
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		return;
	}
=======
>>>>>>> 1ca712f1b6340262b752608dde38e98ef4424d85
	
}
