
public class Card {
<<<<<<< HEAD

	Card(){}
	Card(Person person){
		this.person=person;
		int a=0;
		a=bank.generateCardNumber();
		this.cardNumber=a;
		this.balance=0;
			
	}

=======
	
>>>>>>> 958b03f0f677ff1c0604402198589d5d60b5f496
	private int cardNumber;
	private double balance;
	private Bank bank; // ???
	private Person person;
	
<<<<<<< HEAD

=======
	Card(){}
	Card(Person person, int number){
		this.person = person;
		this.cardNumber = number;
		this.balance = 0;
	}
>>>>>>> 958b03f0f677ff1c0604402198589d5d60b5f496
	
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
<<<<<<< HEAD
		balance-=amount;
		
	}


=======
		this.balance-=amount;
	}

	
>>>>>>> 958b03f0f677ff1c0604402198589d5d60b5f496
}
