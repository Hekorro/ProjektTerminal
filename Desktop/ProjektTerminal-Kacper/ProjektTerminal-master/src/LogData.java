import java.io.Serializable;
import java.util.*;

import javax.sound.midi.Soundbank;
public class LogData implements  Serializable {
	
	LogData() throws EmptyConstructorException
	{
		try {
			throw new EmptyConstructorException("Nie tworz pustych konstruktorow");
		}
		catch(EmptyConstructorException x){
			System.out.println(x.getMessage());
		}
	}
	
	LogData(Firm firm, Card card, double amount, int x){
		this.firm=firm;
		this.owner=card.getPerson();
		this.bank=card.getBank();
		this.amount=amount;
		Date date = new Date();
		
		this.date= date;
		//System.out.println(this.date);
		this.cardNumber=card.getCardNumber();
		if (x==1)
		{
			result="zautoryzowano";
		}
		else 
		{
			result="odrzucono";
		}
		
	}


	private Firm firm;
	private Bank bank;
	private int cardNumber;
	private Person owner;
	private double amount;
	private Date date;
	private String result;

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
public String getResult()
{
	return result;
}

}
