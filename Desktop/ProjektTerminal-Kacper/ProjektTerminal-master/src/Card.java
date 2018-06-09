import java.io.Serializable;

public abstract class Card implements  Serializable {

	Card() throws EmptyConstructorException
	{
		try {
			throw new EmptyConstructorException("Nie tworz pustych konstruktorow");
		}
		catch(EmptyConstructorException x) {
			System.out.println(x.getMessage());
		}
	}
	Card(Person person,Bank bank) throws  WrongArgumentException{
		
		int x=bank.getSerialNumber();
		int y=bank.getCardNumber();
		int z=x*10000;
		try {
		if(person instanceof Person || bank instanceof Bank)
		{
		this.person=person;
		this.cardNumber=z+y;
		this.balance=0;
		this.bank=bank;
		}
		else throw new  WrongArgumentException("Niewlasciwy parametr/parametry");
		}
		catch( WrongArgumentException x1) {
			System.out.println(x1.getMessage());
		}
			
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
	public void payIn(Double amount) throws  WrongArgumentException
	{
		try {
		if(amount instanceof Double ==false || amount<=0)
			throw new  WrongArgumentException("Niewlasciwa kwota");
		else {
			balance+=amount;
		}
		}
		catch( WrongArgumentException x2) {
			System.out.println(x2.getMessage());
		}
	}
	public boolean pay(Double amount,FirmAccount firmAccount) throws  WrongArgumentException {
		try {
		if(balance-amount>0 && amount instanceof Double==true && firmAccount instanceof FirmAccount==true)
		{
		balance-=amount;
		firmAccount.payIn(amount);
		return true;
		}
		else throw new WrongArgumentException("Niewlasciwy parametr/parametry");
		}
		catch(WrongArgumentException x3) {
			System.out.println(x3.getMessage());
		}
		return false;
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
