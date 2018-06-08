
public abstract class Card {

	Card(){}
	Card(Person person,Bank bank){
		int x=bank.getSerialNumber();
		int y=bank.getCardNumber();
		int z=x*10000;
		this.person=person;
		this.cardNumber=z+y;
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
	public void payIn(double amount)
	{
		balance+=amount;
	}
	public boolean pay(double amount,FirmAccount firmAccount) {
		if(balance-amount>0)
		{
		balance-=amount;
		firmAccount.payIn(amount);
		return true;
		}
		else return false;
		
	}
/*trzeba stworzyc obsluge wyjatkow dla amount<0 i balance<0
	public boolean withdraw(double amount) {
		if(balance-amount>0)
		{
		balance-=amount;
		return true;
		}
		else
		{
			System.out.println("Brak wystarczajacych srodkow na koncie");
			return false;
		}
		
	}
*/

}
