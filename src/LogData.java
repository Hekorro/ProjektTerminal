import java.io.Serializable;
import java.util.*;
public class LogData implements  Serializable {
	
	LogData(Firm firm, Card card, double amount,int x){
		this.firm=firm;
		this.owner=card.getPerson();
		this.bank=card.getBank();
		this.amount=amount;
		Date date = new Date();
		if(x==1)
		{
			this.result="Zautoryzowano";
		}
		if(x==0)
		{
			this.result="Odrzucono";
		}
	}

	private String result;
	private Firm firm;
	private Bank bank;
	private int cardNumber;
	private Person owner;
	private double amount;
	private Date date;

public Firm getFirm()
{
	return firm;
}
public Bank getBank()
{
	return bank;
}
public int getCardNumber()
{
	return cardNumber;
}
public Person getOwner()
{
	return owner;
}
public double getAmount()
{
	return amount;
}
public Date getDate()
{
	return date;
}

}
