import java.util.*;
public class LogData {

	private Firm firm;
	private Bank bank;
	private int cardNumber;
	private Person owner;
	private double amount;
	private Date date;
	
	LogData(Card card, double amount, Date date, Firm firm)
	{
		this.firm=firm;
		this.bank=card.getBank();
		this.cardNumber=card.getCardNumber();
		this.owner=card.getPerson();
		this.amount=amount;
		this.date=date;
	}

public Firm getFirm()
{
	return this.firm;
}
public Bank getBank()
{
	return this.bank;
}
public int getCardNumber()
{
	return cardNumber;
}
public Person getOwner()
{
	return this.owner;
}
public double getAmount()
{
	return this.amount;
}
public Date getDate()
{
	return this.date;
}

}
